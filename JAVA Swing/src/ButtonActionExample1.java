import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonActionExample1 {
    JFrame f;
    static JTextField tf;

    public ButtonActionExample1() {
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(200, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Counter"));
        tf = new JTextField(10);
        f.add(tf);
        tf.setText("0");
        JButton b = new JButton("Count");
        f.add(b);
        b.addActionListener(new CounterAction());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonActionExample1();
    }
}

class CounterAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        ButtonActionExample1.tf.setText(Integer.parseInt(ButtonActionExample1.tf.getText()) + 1 +"");
    }
}


