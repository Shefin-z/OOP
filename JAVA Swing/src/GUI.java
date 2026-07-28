import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame;
    JLabel userName;
    JTextField uname;
    JLabel password;
    JTextField pass;
    JButton login;

    JLabel loginStatus;

    public GUI() {

        frame = new JFrame();
        userName = new JLabel();
        uname = new JTextField();
        password = new JLabel();
        pass = new JTextField();
        login = new JButton();

        loginStatus = new JLabel();

//        frame.setLocation(100, 100);
//        frame.setSize(400, 400);
        frame.setVisible(true);
//        frame.setBounds(500, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setLayout(null);

//        userName.setBounds(50, 50, 100, 50);
//        uname.setBounds(200, 50, 100, 50);
//        password.setBounds(50, 150, 100, 50);
//        pass.setBounds(200, 150, 100, 50);
//        login.setBounds(100, 250, 100, 50);
//
//        loginStatus.setBounds(100, 350, 100, 50);

//        userName.setSize(100, 50);
//        uname.setSize(100, 50);
//        password.setSize(100,50);
//        pass.setSize(100,50);
//        login.setSize(100,50);

        loginStatus.setSize(100,50);

        userName.setText("Username");
        password.setText("Password");
        login.setText("Login");

        login.addActionListener(this);

        frame.add(userName, BorderLayout.NORTH);
        frame.add(uname, BorderLayout.SOUTH);
        frame.add(password, BorderLayout.EAST);
        frame.add(pass, BorderLayout.WEST);
        frame.add(login, BorderLayout.CENTER);


//        frame.add(loginStatus);

    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            if (uname.getText().equals("rakin") && pass.getText().equals("1234")) {
                System.out.println("Successful");
                loginStatus.setText("Successful");
            } else {
                System.out.println("Try again");
                loginStatus.setText("Try again");
            }
        }
    }
}