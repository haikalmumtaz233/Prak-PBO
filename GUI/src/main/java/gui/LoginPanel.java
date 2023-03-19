package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPanel extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    private JButton resetBtn, loginBtn;
    private JLabel msgLabel;
    private JTextField userForm;
    private JPasswordField passField;

    public LoginPanel() {
        JPanel panel = new JPanel();
        frame.setTitle("Login Panel");
        frame.setSize(290, 220);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.add(panel);
        panel.setLayout(null);

        //user label + form
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        userForm = new JTextField(20);
        userForm.setBounds(100, 20, 165, 25);
        panel.add(userLabel);
        panel.add(userForm);

        //pass label + field
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10, 50, 80, 25);
        passField = new JPasswordField();
        passField.setBounds(100, 50, 165, 25);
        panel.add(passLabel);
        panel.add(passField);

        //login button
        loginBtn = new JButton("Login");
        loginBtn.setBounds(65, 90, 70, 30);
        loginBtn.setBackground(Color.green);
        loginBtn.setForeground(Color.white);
        loginBtn.addActionListener(this);
        loginBtn.setFocusable(false);
        panel.add(loginBtn);

        //reset button
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(145, 90, 70, 30);
        resetBtn.setBackground(Color.red);
        resetBtn.setForeground(Color.white);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(this);
        panel.add(resetBtn);

        //message label
        msgLabel = new JLabel("");
        panel.add(msgLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        LoginPanel lp = new LoginPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetBtn) {
            userForm.setText("");
            passField.setText("");
            msgLabel.setText("");
        }
        if (e.getSource() == loginBtn) {
            String username = userForm.getText();
            String password = String.valueOf(passField.getPassword());

            if ("admin".equals(username) && "admin".equals(password)) {
                WelcomePanel wp = new WelcomePanel();
                frame.dispose();

            } else {
                msgLabel.setText("Wrong username or password");
                msgLabel.setForeground(Color.red);
                msgLabel.setBounds(60, 130, 190, 40);
            }
            if ("".equals(username)) {
                msgLabel.setText("Insert username");
                msgLabel.setForeground(Color.red);
                msgLabel.setBounds(100, 130, 150, 40);
            }
            if ("".equals(password)) {
                msgLabel.setText("Insert password");
                msgLabel.setForeground(Color.red);
                msgLabel.setBounds(100, 130, 150, 40);
            }
            if ("".equals(username) && "".equals(password)) {
                msgLabel.setText("Insert username & password");
                msgLabel.setForeground(Color.red);
                msgLabel.setBounds(60, 130, 190, 40);
            }
        }
    }
}
