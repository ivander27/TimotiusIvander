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
/**
 *
 * @author Asus
 */
public class GoFoodScreen {
    public GoFoodScreen(){
        JFrame frame = new JFrame("Pilih Restaurant!!!");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        
        String namarestaurant[] = new String[1];
        //namarestaurant[0]=;
        
        JComboBox restaurant;
        restaurant = new JComboBox();
        restaurant.setBounds(200, 50, 300, 30);
        restaurant.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                
            } 
        });
        frame.add(restaurant);
        
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
