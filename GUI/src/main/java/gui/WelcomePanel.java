package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WelcomePanel {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel welcomeMsg = new JLabel("");
    JButton logoutBtn = new JButton("Logout");

    WelcomePanel() {
        frame.setTitle("Welcome Panel");
        frame.setSize(350, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.add(panel);
        panel.setLayout(null);

        //welcome label
        welcomeMsg.setText("You Have Successfully Login");
        welcomeMsg.setBounds(10, 10, 350, 50);
        welcomeMsg.setForeground(Color.green);
        welcomeMsg.setFont(new Font(null, Font.ITALIC, 24));
        panel.add(welcomeMsg);

         //logout button
        logoutBtn.setBounds(115, 60, 100, 30);
        logoutBtn.setForeground(Color.white);
        logoutBtn.setBackground(Color.red);
        logoutBtn.setFont(new Font(null, Font.BOLD, 16));
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener((ActionEvent e) -> {
            if(e.getSource() == logoutBtn){
                LoginPanel lp = new LoginPanel();
                frame.dispose();
            }
        });
        panel.add(logoutBtn);
        frame.setVisible(true);
    }
}
