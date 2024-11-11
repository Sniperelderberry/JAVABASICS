import java.awt.*;

public class DemoLabel extends Frame {

    public static void main(String[] args) {
        TextField t1= new TextField(30);
        TextField t2= new TextField(30);
        TextField t3= new TextField(30);
        TextField t4= new TextField(30);

        t1.setEditable(false);
        t2.setText("SUKHDEEP");;
        String str=t2.getText();
        t3.setText(str);
        t4.setEchoChar('*');

        DemoLabel f1= new DemoLabel();
        f1.setTitle("This is the example");
        f1.setLayout(new FlowLayout());

        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        
        f1.setSize(500,200);
        f1.setVisible(true);

    }
}  