package application.elevator;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ButtonReader {
    private String filename;

    public ButtonReader(String filename) {
        this.filename = filename;
    }

    public int[] readButtons() {

        String[] buttonStringList = null;
        int[] buttonIntList = null;

        try {
            File buttonFile = new File(this.filename);
            Scanner buttonReader = new Scanner(buttonFile);
            while (buttonReader.hasNextLine()) {
                String currentButton = buttonReader.nextLine();
                buttonStringList = currentButton.split(" ");
                buttonIntList = stringToIntArray(buttonStringList);
            }
            buttonReader.close();
        }
        catch (FileNotFoundException e){
            System.err.println("File not found.");
        }
        catch (NumberFormatException e){
            System.err.println("File format incorrect.");
        }

        return buttonIntList;
    }

    public int[] stringToIntArray(String[] buttonStringList) throws NumberFormatException {
        int[] buttonIntList = new int[buttonStringList.length];
        for (int i = 0; i < buttonStringList.length; i++) {
                buttonIntList[i] = Integer.parseInt(buttonStringList[i]);
        }
        return buttonIntList;
    }
}
