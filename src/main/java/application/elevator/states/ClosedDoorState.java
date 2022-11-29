package application.elevator.states;

import application.elevator.Elevator;

public class ClosedDoorState implements State {
    Elevator elevator;

    public ClosedDoorState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void openDoor() {
    }

    public void closeDoor() {
    }

    public void buttonPress(int floorNumber) {
        
    }

    public void moveUp() {
        elevator.setState(elevator.getMovingUpState());
        System.out.println("Going up...");
    }

    public void moveDown() {
        elevator.setState(elevator.getMovingDownState());
        System.out.println("Going down...");
    }

    public void arrive(int floorNumber) {
        elevator.setState(elevator.getIdleState());
        System.out.println("Nothing happens");
    }
}
