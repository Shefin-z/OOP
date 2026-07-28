import javax.swing.*;

class GUI1 extends Thread{
    JFrame frame;
    JTextField textField;

    public GUI1() {
        frame = new JFrame("GUI1");
        textField = new JTextField();
        frame.setLayout(null);

        frame.setLocation(500,300);
        frame.setSize(300, 300);
        textField.setBounds(50, 50, 100, 60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(textField);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                textField.setText(i + "");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupt exception");;
            }
        }
    }
}

class GUI2 extends Thread{
    JFrame frame;
    JTextField textField;

    public GUI2() {
        frame = new JFrame("GUI2");
        textField = new JTextField();
        frame.setLayout(null);

        frame.setLocation(1000,300);
        frame.setSize(300, 300);
        textField.setBounds(50, 50, 100, 60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(textField);
    }

    public void run() {
        for (int i = 0; i > -100; i--) {
            try {
                textField.setText(i + "");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupt exception");;
            }
        }
    }
}

public class ThreadwithGUI {
    public static void main(String[] args) {
        GUI1 gui1 = new GUI1();
        GUI2 gui2 = new GUI2();
        gui1.start();
        gui2.start();
    }
}
