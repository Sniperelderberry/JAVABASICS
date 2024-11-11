import java.awt.*;

public class TextAreaExample {

    public static void main(String[] args) {
        // Create the frame for the application
        Frame frame = new Frame("TextArea Example");

        // Create a Label
        Label label = new Label("Enter some text:");
        label.setBounds(50, 50, 100, 30); // Position for label

        // Create a TextArea for user input
        TextArea textArea = new TextArea();
        textArea.setBounds(50, 90, 300, 100); // Align TextArea below the label with better alignment

        // Add components to the frame
        frame.add(label);
        frame.add(textArea);

        // Set up frame settings
        frame.setSize(400, 250);  // Frame size adjusted for proper space
        frame.setLayout(null);     // Use absolute positioning
        frame.setVisible(true);    // Make the frame visible
    }
}
