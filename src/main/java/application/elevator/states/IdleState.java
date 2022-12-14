package application.elevator.states;

import application.elevator.Elevator;

public class IdleState implements State {
    Elevator elevator;

    public IdleState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void openDoor() {

    }

    public void closeDoor() {
    }

    public void buttonPress(int floorNumber) {
        elevator.setState(elevator.getButtonSelectedState());
        System.out.println(floorNumber + " pressed");
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void arrive(int floorNumber) {
    }
}
