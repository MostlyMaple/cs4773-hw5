package application.elevator.states;

import application.elevator.Elevator;


public class ArrivedState implements State {
        
    Elevator elevator;

    public ArrivedState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void openDoor() {
        elevator.setState(elevator.getIdleState());
        if (elevator.getIsDoorClosed()) {
            elevator.setIsDoorClosed(false);
            System.out.println("Doors are open");
        }
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
    }
}
