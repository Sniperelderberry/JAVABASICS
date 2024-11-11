import java.awt.*;

public class TextFieldExample {

    public static void main(String[] args) {
        // Create the frame for the application
        Frame frame = new Frame("TextField Example");

        // Create a Label
        Label label = new Label("Enter some text:");
        label.setBounds(50, 50, 100, 30); // Set position and size for label

        // Create a TextField for user input
        TextField textField = new TextField();
        textField.setBounds(160, 50, 180, 30); // Set position and size for text field

        // Add components to the frame
        frame.add(label);
        frame.add(textField);

        // Set up frame settings
        frame.setSize(400, 150);
        frame.setLayout(null);  // Use absolute positioning
        frame.setVisible(true);
    }
}
