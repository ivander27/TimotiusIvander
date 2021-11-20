/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import Controller.DatabaseControl;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
/**
 *
 * @author Asus
 */
public class ScreenLogin  extends JFrame implements ActionListener{
    private JFrame Login;
    private JLabel labelusername,labelpassword,labeljudul;
    private JTextField fieldusername,fieldemail;
    private JPasswordField fieldpassword;
    private JButton confirmbutton,backbutton;
    
    public ScreenLogin(){
        Login = new JFrame("Login");
        Login.setSize(400, 300);
        Login.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Login.setLocationRelativeTo(null);
        
        labeljudul = new JLabel("Silahkan Insert Data Dibawah ");
        labeljudul.setBounds(100, 10, 200, 30);
        
        labelusername = new JLabel("Name");
        labelusername.setBounds(45, 50, 100, 30);
        
        fieldusername = new JTextField();
        fieldusername.setBounds(150, 50, 200, 30);
        
        labelpassword = new JLabel("Password");
        labelpassword.setBounds(45, 100, 100, 30);
        
        fieldpassword = new JPasswordField();
        fieldpassword.setBounds(150, 100, 200, 30);        
        
        confirmbutton = new JButton("Confirm");
        confirmbutton.setBounds(45,150,300,30);
        confirmbutton.addActionListener(this);
        
        backbutton = new JButton("Back");
        backbutton.setBounds(250,200,100,30);
        backbutton.addActionListener(this);
        
        Login.add(labeljudul);
        Login.add(backbutton);
        Login.add(confirmbutton);
        Login.add(fieldusername);
        Login.add(labelusername);
        Login.add(labelpassword);
        Login.add(fieldpassword);
        Login.setLayout(null);
        Login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command){
            case"Confirm":
                String name = fieldusername.getText();
                String password = fieldpassword.getText();
                RegistrasiUser user = new RegistrasiUser();
                if(name.equals("") || password.equals("")){
                    JOptionPane.showMessageDialog(null, "Silahkan isikan email dan password anda", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }else if(user.CekLogin(name, password)){
                    Login.setVisible(false);
                    new UpdateScreen(user);
                }
            break;
            case"Reset":
                Login.setVisible(false);
                new RegisterScreen();
                break;
            case"Back":
                Login.setVisible(false);
                new MainMenu();
                break;
            default:
                break;
        }
    }
}
