import java.awt.*;

public class CheckboxExample {

    public static void main(String[] args) {
        // Create the frame for the application
        Frame frame = new Frame("Checkbox Example");

        // Create a Label
        Label label = new Label("Select Hobbies:");
        label.setBounds(50, 50, 150, 30); 

        // Create Checkboxes
        Checkbox checkbox1 = new Checkbox("Playing");
        checkbox1.setBounds(50, 100, 100, 30); 

        Checkbox checkbox2 = new Checkbox("Singing");
        checkbox2.setBounds(50, 140, 100, 30); 

        Checkbox checkbox3 = new Checkbox("Travelling");
        checkbox3.setBounds(50, 180, 100, 30); 

        // Add components to the frame
        frame.add(label);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);

        // Set up frame settings
        frame.setSize(300, 250);
        frame.setLayout(null); // Use absolute positioning
        frame.setVisible(true);

        // The program does not handle window closing.
    }
}


