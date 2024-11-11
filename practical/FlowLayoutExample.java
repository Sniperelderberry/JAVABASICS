import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Example");

        frame.setLayout(new FlowLayout()); // Set FlowLayout

        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));

        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
