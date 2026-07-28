import javax.swing.*;
import java.awt.*;

public class Example3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame"); // Creating the top level  container
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 100);
        Container p = f.getContentPane();
        JButton b = new JButton("Click here"); //Create a JButton  object
        p.add(b);	// add button to panel

        f.setVisible(true);
    }
}