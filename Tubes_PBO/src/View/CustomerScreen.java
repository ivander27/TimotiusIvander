/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
/**
 *
 * @author Asus
 */
public class CustomerScreen extends JFrame implements ActionListener{
    private JFrame frame;
    private JLabel labeljudul;
    private JButton gojekbutton,gofoodbutton,topupbutton,userprofilebutton;
    public CustomerScreen(){
        frame = new JFrame("Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        labeljudul = new JLabel("Silahkan Pilih ");
        labeljudul.setBounds(160, 10, 200, 30);
        
        gojekbutton = new JButton("GoJek");
        gojekbutton.setBounds(100, 50, 200, 30);
        gojekbutton.addActionListener(this);
        
        gofoodbutton = new JButton("GoFood");
        gofoodbutton.setBounds(100, 100, 200, 30);
        gofoodbutton.addActionListener(this);
        
        topupbutton = new JButton("TopUp");
        topupbutton.setBounds(100, 150, 200, 30);
        topupbutton.addActionListener(this);
        
        userprofilebutton = new JButton("UserProfile");
        userprofilebutton.setBounds(100, 150, 200, 30);
        userprofilebutton.addActionListener(this);
        
        frame.add(labeljudul);
        frame.add(gojekbutton);
        frame.add(gofoodbutton);
        frame.add(topupbutton);
        frame.add(userprofilebutton);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         String command = ae.getActionCommand();
        switch(command){
            case"GoJek":
               frame.setVisible(false);
               new MenuGojek();
            break;
            case"GoFood":
                frame.setVisible(false);
                new GoFoodScreen();
                break;
            case"TopUp":
                frame.setVisible(false);
                new ScreenTopUp();
                break;
            case"UserProfile":
                frame.setVisible(false);
                new ScreenUserProfile();
                break;
            default:
                break;
        }
    }
}
