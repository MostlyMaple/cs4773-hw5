package application;
import application.elevator.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ButtonReader buttonReader = new ButtonReader("input.txt");
        int[] buttonList = buttonReader.readButtons();
        Elevator elevator = new Elevator();
        for (int button: buttonList) {
            elevator.buttonPress(button);
        }
        

    }
}
