import java.awt.*;
import java.awt.event.*;

public class GraphicsExample extends Frame {

    public GraphicsExample() {
        super("Graphics Example");
        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        // Set background color
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw a rectangle
        g.setColor(Color.blue);
        g.fillRect(50, 50, 100, 80);

        // Draw an oval
        g.setColor(Color.red);
        g.fillOval(200, 50, 100, 80);

        // Draw a line
        g.setColor(Color.green);
        g.drawLine(50, 200, 300, 200);

        // Draw text
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java AWT Graphics Example", 50, 250);
    }

    public static void main(String[] args) {
        new GraphicsExample();
    }
}
