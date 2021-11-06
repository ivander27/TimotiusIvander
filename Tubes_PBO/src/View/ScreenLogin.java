/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Asus
 */
public class ScreenLogin {
    public ScreenLogin(){
        JFrame frame = new JFrame("Selamat Datang!!!");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        
        JLabel label;
        label = new JLabel("Login");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel username;
        username = new JLabel("Username");
        username.setBounds(50, 100, 100, 30);
        frame.add(username);
        JTextField inputusername;
        inputusername = new JTextField();
        inputusername.setBounds(100, 105, 50, 50);
        frame.add(inputusername);
        JLabel password;
        password = new JLabel("Password");
        password.setBounds(50, 200, 100, 30);
        frame.add(password);
        JTextField inputpassword;
        inputpassword = new JTextField();
        inputpassword.setBounds(100, 205, 50, 50);
        frame.add(inputpassword);
        
        JButton login;
        login = new JButton("Login");
        login.setBounds(50, 430, 70, 30);
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(login);
        JButton cancel;
        cancel = new JButton("Back");
        cancel.setBounds(50, 430, 100, 30);
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new ScreenLogin();
            }
            
        });
        frame.add(cancel);
    }
}
