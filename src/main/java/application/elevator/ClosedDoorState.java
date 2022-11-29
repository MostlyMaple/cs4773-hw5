package application.elevator;

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
        elevator.setState(elevator.movingUpState);
        System.out.println("Going up...");
    }

    public void moveDown() {
        elevator.setState(elevator.movingDownState);
        System.out.println("Going down...");
    }

    public void arrive(int floorNumber) {
        elevator.setState(elevator.idleState);
        System.out.println("Nothing happens");
    }
}
