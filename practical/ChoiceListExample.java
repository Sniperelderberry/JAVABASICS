import java.awt.*;

public class ChoiceListExample {

    public static void main(String[] args) {
        // Create the frame for the application
        Frame frame = new Frame("Choice List Example");

        // Create a Label
        Label label = new Label("Choose a Subject:");
        label.setBounds(50, 50, 150, 30); 

        // Create a Choice (dropdown menu)
        Choice choice = new Choice();
        choice.setBounds(50, 100, 150, 30); 

        // Add items to the Choice list
        choice.add("Java");
        choice.add("Php");
        choice.add("SPM");

        // Add components to the frame
        frame.add(label);
        frame.add(choice);

        // Set up frame settings
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

