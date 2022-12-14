package application.elevator;

import application.elevator.states.*;

public class Elevator {
    
    private State closedDoorState;
    private State idleState;
    private State buttonSelectedState;
    private State movingUpState;
    private State movingDownState;
    private State arrivedState;
    private State state;

    private int currentFloor = 1;
    private int selectedFloor;

    private boolean isDoorClosed = false;

    public Elevator() {
        this.idleState = new IdleState(this);
        this.movingUpState = new MovingUpState(this);
        this.movingDownState = new MovingDownState(this);
        this.buttonSelectedState = new ButtonSelectedState(this);
        this.arrivedState = new ArrivedState(this);
        this.closedDoorState = new ClosedDoorState(this);

        this.state = this.idleState;
    }

    public State getIdleState() {
        return this.idleState;
    }

    public State getMovingUpState() {
        return this.movingUpState;
    }

    public State getMovingDownState() {
        return this.movingDownState;
    }

    public State getButtonSelectedState() {
        return this.buttonSelectedState;
    }

    public State getArrivedState() {
        return this.arrivedState;
    }

    public State getClosedDoorState() {
        return this.closedDoorState;
    }

    public boolean getIsDoorClosed() {
        return this.isDoorClosed;
    }

    public void setIsDoorClosed(boolean doorStatus) {
        this.isDoorClosed = doorStatus;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void arrive() {
        state.arrive(selectedFloor);
    }

    public void moveUp() {
        state.moveUp();
    }

    public void moveDown() {
        state.moveDown();
    }

    public void closeDoor() {
        state.closeDoor();
    }

    public void openDoor() {
        state.openDoor();
    }

    public void buttonPress(int selectedButton) {
        this.selectedFloor = selectedButton;
        state.buttonPress(selectedButton);
        closeDoor();
        if (selectedFloor != currentFloor) {
            if (selectedFloor > currentFloor) {
                moveUp();
                arrive();
                openDoor();
            }
            else {
                moveDown();
                arrive();
                openDoor();
            }
        }
        else {
            arrive();
        }
    }
}
