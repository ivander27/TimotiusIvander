/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CustomerManager;
import Controller.UserManager;
import Model.Customers;
import Model.Driver;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Member;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class MenuProfile {
    private JLabel labelNama, labelUsername, labelAlamat, labelSaldoOvo, labelIsiNama, labelIsiUsername, labelIsiAlamat, labelIsiSaldo;
    private JButton buttonBack, buttonLogout;
    JFrame frame = new JFrame("My Profile");
    public MenuProfile(){
        frame.setSize(450, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelNama = new JLabel("Nama");
        labelUsername = new JLabel("Username");
        labelAlamat = new JLabel("Alamat");
        
        buttonBack = new JButton("Back");
        buttonLogout = new JButton("Logout");
        
        if(CustomerManager.getInstance().getUser() instanceof Customers){
            Customers customer = (Customers) CustomerManager.getInstance().getUser();
            labelSaldoOvo = new JLabel("Saldo Ovo");
            labelIsiSaldo = new JLabel("Rp. " + Customers.getSaldoovo());
            frame.add(labelSaldoOvo);
            frame.add(labelIsiSaldo);
        }else if(CustomerManager.getInstance().getUser() instanceof Driver){
            Driver driver = (Driver) UserManager.getInstance().getUser();
        }
        labelIsiNama = new JLabel(UserManager.getInstance().getUser().getNama());
        labelIsiUsername = new JLabel(UserManager.getInstance().getUser().getUsername());
        labelIsiAlamat = new JLabel(UserManager.getInstance().getUser().getAlamat());
        
        labelNama.setBounds(50, 10, 100, 20);
        labelUsername.setBounds(50, 40, 100, 20);
        labelAlamat.setBounds(50, 70, 100, 20);
        labelSaldoOvo.setBounds(50, 100, 100, 20);
        
        labelIsiNama.setBounds(120, 10, 200, 20);
        labelIsiUsername.setBounds(120, 40, 200, 20);
        labelIsiAlamat.setBounds(120, 70, 200, 20);
        labelIsiSaldo.setBounds(120, 100, 200, 20);
        
        buttonBack.setBounds(100, 180, 100, 20);
        buttonLogout.setBounds(210, 180, 100, 20);
        
        buttonLogout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int jawab = JOptionPane.showConfirmDialog(null, "Yakin ingin Logout?");
                switch(jawab){
                    case JOptionPane.YES_OPTION:
                        JOptionPane.showMessageDialog(null, "Terima kasih terlah menggunakan aplikasi ini!");
                        frame.setVisible(false);
                        UserManager.getInstance().setUser(null);
                        new ScreenLogin();
                }
            }
        });
        buttonBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(CustomerManager.getInstance().getUser() instanceof Customers){
                    frame.setVisible(false);
                    new CustomerScreen();
                }else if(CustomerManager.getInstance().getUser() instanceof Driver){
                    frame.setVisible(false);
                    new DriverScreen();
                }
            }
        });
        
        frame.add(labelNama);
        frame.add(labelUsername);
        frame.add(labelAlamat);
        frame.add(labelIsiNama);
        frame.add(labelIsiUsername);
        frame.add(buttonBack);
        frame.add(buttonLogout);
        frame.add(labelIsiAlamat);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
