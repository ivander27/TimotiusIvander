/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CustomerManager;
import Controller.PesananManager;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Berto
 */
public class MenuGojek {
    JFrame frame;
    private JLabel labelAlamat;
    private JComboBox cbAlamat;
    private JButton buttonBack, buttonLogout, buttonNext;
    
    public MenuGojek(){
        frame = new JFrame ("Menu Gojek");
        frame.setSize(450, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String alamat[] = new String[2];
        alamat[0] = CustomerManager.getInstance().getCustomer().getAlamat();
        alamat[1] = "Alamat Lain";
        
        labelAlamat = new JLabel("Silahkan Pilih Alamat Penjemputan: ");
        cbAlamat = new JComboBox(alamat);
        buttonNext = new JButton("NEXT");
        buttonBack = new JButton("BACK");
        buttonLogout = new JButton("LOGOUT");
        
        labelAlamat.setFont(new Font(labelAlamat.getFont().getName(), labelAlamat.getFont().getStyle(), 18));
        
        labelAlamat.setBounds(100, 10, 300, 20);
        cbAlamat.setBounds(120, 50, 200, 20);
        buttonNext.setBounds(170,100,100,20);
        buttonBack.setBounds(10, 150, 100, 20);
        buttonLogout.setBounds(320, 150, 100, 20);
        
        cbAlamat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(cbAlamat.getSelectedItem().equals("Alamat Lain")){
                    boolean cek = false;
                    while(!cek){
                        String baru = JOptionPane.showInputDialog("Masukkan Alamat Baru");
                        int jawab = JOptionPane.showConfirmDialog(null, baru + "\nYakin ?");
                        if(jawab == JOptionPane.YES_OPTION){
                            cek = true;
                            alamat[1] = baru;
                            cbAlamat.removeAllItems();
                            cbAlamat.addItem(alamat[0]);
                            cbAlamat.addItem(alamat[1]);
                        }
                    }
                }
            }
        });
        
        buttonNext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int jawab = JOptionPane.showConfirmDialog(null, "Sudah Benar?");
                if(jawab == JOptionPane.YES_OPTION){
                    PesananManager.getInstance().getPesanan().setTitikakhir(String.valueOf(cbAlamat.getSelectedItem()));
                }
            }
        });
        
        buttonLogout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                int jawab = JOptionPane.showConfirmDialog(null, "Yakin ingin Logout?");
                if(jawab == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Terima Kasih sudah menggunakan layanan kami");
                    DatabaseControl
                }
            }
        
        });
        
        
    }
}
