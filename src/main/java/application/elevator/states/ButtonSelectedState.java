package application.elevator.states;

import application.elevator.Elevator;

public class ButtonSelectedState implements State {
    
    Elevator elevator;

    public ButtonSelectedState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void openDoor() {

    }

    public void closeDoor() {
        elevator.setState(elevator.getClosedDoorState());
        if (!elevator.getIsDoorClosed()) {
            elevator.setIsDoorClosed(true);
            System.out.println("Doors are closed");
        }
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
