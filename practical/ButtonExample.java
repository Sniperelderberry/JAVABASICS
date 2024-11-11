import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {
        // Create a Frame (window) to hold the Button
        Frame frame = new Frame("Button Example");

        // Create a Button
        Button button = new Button("Click Me");

        // Create an ActionListener to handle button clicks
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        };

        // Add the ActionListener to the Button
        button.addActionListener(actionListener);

        // Add the Button to the Frame
        frame.add(button);

        // Set the size of the Frame
        frame.setSize(300, 200);

        // Make the Frame visible
        frame.setVisible(true);

        // Handle closing the Frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
