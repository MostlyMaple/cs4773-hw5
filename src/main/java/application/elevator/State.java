package application.elevator;

public interface State {

    void openDoor();

    void closeDoor();

    void buttonPress(int floorNumber);

    void moveUp();

    void moveDown();

    void arrive(int floorNumber);

}
