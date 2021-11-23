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
import Model.Pesanan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author William
 */
public class MenuHistory {
    private JTable tableHistory;
    private JButton buttonBack, buttonLogout;
    private JScrollPane sp;
    JFrame frame = new JFrame();
    public MenuHistory(){
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ArrayList<Pesanan> allPesanan = new ArrayList<>();
        String kolom[] = {"ID", "Tipe Pesanan", "Tanggal Pemesanan", "Alamat Jemput", "Alamat Tujuan", "Total Harga", "Status"};
        
        if(CustomerManager.getInstance().getUser() instanceof Customers){
            Customers customer = (Customers) CustomerManager.getInstance().getUser();
            allPesanan = customer.getPesanan();
        }else if(CustomerManager.getInstance().getUser() instanceof Driver){
            Driver driver = (Driver) UserManager.getInstance().getUser();
            allPesanan = driver.getPesanan();
        }
        String[][] data = new String[2][7];

        for(int i = 0; i < allPesanan.size(); i++){
            String status;
            if(allPesanan.get(i).getStatus() == 2){
                status = "Selesai";
            }else if(allPesanan.get(i).getStatus() == 1){
                status = "Diterima";
            }else{
                status = "Belum Diterima";
            }
            data[i][0] = String.valueOf(allPesanan.get(i).getId_pesanan());
            data[i][1] = allPesanan.get(i).getDate();
            data[i][2] = allPesanan.get(i).getTitikawal();
            data[i][3] = allPesanan.get(i).getTitikakhir();
            data[i][4] = status;
        }
        
        tableHistory = new JTable(data, kolom);
        buttonBack = new JButton("Back");
        buttonLogout = new JButton("Logout");
        
        tableHistory.setBounds(30, 40, 800, 300);
        buttonBack.setBounds(300, 300, 100, 20);
        buttonLogout.setBounds(410, 300, 100, 20);
        
        sp = new JScrollPane(tableHistory);
        
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
        frame.add(buttonBack);
        frame.add(buttonLogout);
        frame.add(sp);
        frame.setVisible(true);
    }
}
