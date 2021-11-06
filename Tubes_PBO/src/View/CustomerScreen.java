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
/**
 *
 * @author Asus
 */
public class CustomerScreen {
    public CustomerScreen(){
        JFrame frame = new JFrame("Selamat Datang!!!");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        
        JLabel label;
        label = new JLabel("Customer");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        JButton gojek;
        gojek = new JButton("Gojek");
        gojek.setBounds(50, 430, 70, 30);
        gojek.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(gojek);
        JButton gofood;
        gofood = new JButton("Go Food");
        gofood.setBounds(50, 430, 70, 30);
        gofood.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(gofood);
        JButton topup;
        topup = new JButton("TopUp");
        topup.setBounds(50, 430, 70, 30);
        topup.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(topup);
        JButton userprofile;
        userprofile = new JButton("Profile");
        userprofile.setBounds(50, 430, 70, 30);
        userprofile.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(userprofile);
    }
}
