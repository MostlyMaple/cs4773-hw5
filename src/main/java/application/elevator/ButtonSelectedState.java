package application.elevator;

public class ButtonSelectedState implements State {
    
    Elevator elevator;

    public ButtonSelectedState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void openDoor() {

    }

    public void closeDoor() {
        elevator.setState(elevator.closedDoorState);
        if (!elevator.isDoorClosed) {
            elevator.setDoorClosed(true);
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
