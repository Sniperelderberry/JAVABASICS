import java.awt.*;

public class GreetingApp {
    public static void main(String[] args) {
        // Create the frame (default layout is FlowLayout)
        Frame frame = new Frame("Greeting App");

        // Components
        Label label = new Label("Enter your name:");
        TextField nameField = new TextField(20); // Set width to 20 characters
        Button greetButton = new Button("Greet");
        Label greetingLabel = new Label();

        // Set the frame layout to FlowLayout
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // Add components to the frame
        frame.add(label);
        frame.add(nameField);
        frame.add(greetButton);
        frame.add(greetingLabel);

        // Button click action
        greetButton.addActionListener(e -> {
            String name = nameField.getText();
            greetingLabel.setText("Goodbye, " + name + "!");
        });

        // Frame setup
        frame.setSize(400, 150); // Adjust the size of the frame
        frame.setVisible(true);
    }
}
