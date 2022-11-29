package application.elevator.states;

import application.elevator.Elevator;

public class MovingUpState implements State{

    Elevator elevator;

    public MovingUpState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void openDoor() {

    }

    public void closeDoor() {

    }

    public void buttonPress(int floorNumber) {
        
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void arrive(int floorNumber) {
        elevator.setState(elevator.getArrivedState());
        elevator.setCurrentFloor(floorNumber);
        System.out.println("*ding* The elevator arrives at Floor " + floorNumber);
    }

}
