/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DatabaseControl;
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
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class OrderFoodScreen {
    public OrderFoodScreen(){
        JFrame frame = new JFrame("Pilih Food!!!");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        
        String namamakanan[] = new String[1];
        //namarestaurant[0]=;
        
        JComboBox makanan;
        makanan = new JComboBox();
        makanan.setBounds(200, 50, 300, 30);
        makanan.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                
            } 
        });
        frame.add(makanan);
       
        JLabel qtymakanan;
        qtymakanan = new JLabel("Jumlah Makanan");
        qtymakanan.setBounds(50, 100, 100, 30);
        frame.add(qtymakanan);
       
        JTextField inputqtymakan;
        inputqtymakan = new JTextField();
        inputqtymakan.setBounds(100, 105, 50, 50);
        frame.add(inputqtymakan);
        
        JComboBox minuman;
        minuman = new JComboBox();
        minuman.setBounds(200, 50, 300, 30);
        minuman.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                
            } 
        });
        frame.add(minuman);
        
        JLabel qtyminuman;
        qtyminuman = new JLabel("Jumlah Minuman");
        qtyminuman.setBounds(50, 100, 100, 30);
        frame.add(qtyminuman);
       
        JTextField inputqtyminum;
        inputqtyminum = new JTextField();
        inputqtyminum.setBounds(100, 105, 50, 50);
        frame.add(inputqtyminum);
        
        JButton next;
        next = new JButton("Next");
        next.setBounds(50, 430, 70, 30);
        next.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(next);
        
        JButton back;
        back = new JButton("Back");
        back.setBounds(50, 430, 70, 30);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            } 
        });
        frame.add(back);
        
    }
}
