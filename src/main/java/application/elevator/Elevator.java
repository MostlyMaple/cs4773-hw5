package application.elevator;

public class Elevator {
    
    State closedDoorState;
    State idleState;
    State buttonSelectedState;
    State movingUpState;
    State movingDownState;
    State arrivedState;
    State state;

    int currentFloor = 1;
    int selectedFloor;
    
    boolean isDoorClosed = false;

    public Elevator() {
        this.idleState = new IdleState(this);
        this.movingUpState = new MovingUpState(this);
        this.movingDownState = new MovingDownState(this);
        this.buttonSelectedState = new ButtonSelectedState(this);
        this.arrivedState = new ArrivedState(this);
        this.closedDoorState = new ClosedDoorState(this);

        this.state = this.idleState;
    }

    public void setDoorClosed(boolean doorStatus) {
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
