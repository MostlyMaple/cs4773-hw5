package application.elevator;

public class ArrivedState implements State {
        
    Elevator elevator;

    public ArrivedState(Elevator elevator) {
        this.elevator = elevator;
    }

    public void openDoor() {
        elevator.setState(elevator.idleState);
        if (elevator.isDoorClosed) {
            elevator.setDoorClosed(false);
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
