import java.awt.*;
import java.awt.event.*;

public class RadioButtonExample {

    public static void main(String[] args) {
        // Create the frame for the application
        Frame frame = new Frame("Radio Button Example");

        // Create a Label
        Label label = new Label("Choose your Gender:");
        label.setBounds(50, 50, 150, 30); // Set position and size

        // Create a CheckboxGroup for the radio buttons
        CheckboxGroup group = new CheckboxGroup();

        // Create two radio buttons (Checkboxes inside a CheckboxGroup)
        Checkbox radio1 = new Checkbox("Male", group, false);
        radio1.setBounds(50, 100, 100, 30); // Set position and size

        Checkbox radio2 = new Checkbox("Female", group, false);
        radio2.setBounds(50, 140, 100, 30); // Set position and size

        // Create a label to display the selected option
        Label resultLabel = new Label();
        resultLabel.setBounds(50, 180, 200, 30); // Set position and size

        // Add ItemListener to capture selection events
        radio1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                resultLabel.setText("Selected: Male");
            }
        });

        radio2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                resultLabel.setText("Selected: Female");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(resultLabel);

        // Set up frame settings
        frame.setSize(300, 250);
        frame.setLayout(null);  // Use absolute positioning
        frame.setVisible(true);
    }
}

