import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout Example");
        
        frame.setLayout(new GridLayout(2, 2));  // 2 rows and 2 columns

        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

