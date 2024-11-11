import java.awt.*;
import java.awt.event.*;

public class TextFieldButtonExample {

    public static void main(String[] args) {
        // Create the frame for the application
        Frame frame = new Frame("TextField and Button Example");

        // Create a Label
        Label label = new Label("Enter some text:");
        label.setBounds(50, 50, 100, 30); // Set position and size

        // Create a TextField for user input
        TextField textField = new TextField();
        textField.setBounds(150, 50, 200, 30);

        // Create a Button
        Button button = new Button("Submit");
        button.setBounds(150, 100, 80, 30);

        // Create a TextArea to display the entered text
        TextArea textArea = new TextArea();
        textArea.setBounds(50, 150, 300, 100);
        textArea.setEditable(false); // Make TextArea non-editable

        // Add an ActionListener to the button to handle the click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredText = textField.getText(); // Get text from TextField
                textArea.setText("You entered: " + enteredText); // Display text in TextArea
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(textArea);

        // Set up frame settings
        frame.setSize(400, 300);
        frame.setLayout(null); // Use absolute positioning for this example
        frame.setVisible(true);

        // Close operation for the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
