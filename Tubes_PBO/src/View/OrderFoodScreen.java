/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Food;
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
import javax.swing.JComboBox;

/**
 *
 * @author Asus
 */
public class OrderFoodScreen extends JFrame implements ActionListener{
    private JFrame frame;
    private JLabel labelmakanan1,labelmakanan2,labelmakanan3,labelmakanan4,labelmakanan5,labeljudul;
    private JTextField fieldqty1,fieldqty2,fieldqty3,fieldqty4,fieldqty5;
    private JButton buttonsubmit,buttoncancel;
    public OrderFoodScreen(){
        frame = new JFrame("Go Food");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        labeljudul = new JLabel("Silahkan Pilih Makanan");
        labeljudul.setBounds(150, 10, 200, 30);
                        
        labelmakanan1 = new JLabel("Makanan 1");
        labelmakanan1.setBounds(45,50,100,30);
        
         fieldqty1 = new JTextField();
        fieldqty1.setBounds(150,50,50,30);
        
        labelmakanan2 = new JLabel("Makanan2");
        labelmakanan2.setBounds(45,100,100,30);
        
        fieldqty2 = new JTextField();
        fieldqty2.setBounds(150,100,50,30);
        
        labelmakanan3 = new JLabel("Makanan3");
        labelmakanan3.setBounds(45,150,100,30);
        
        fieldqty3 = new JTextField();
        fieldqty3.setBounds(150,150,50,30);
        
        labelmakanan4 = new JLabel("Makanan4");
        labelmakanan4.setBounds(45,200,100,30);
        
        fieldqty4 = new JTextField();
        fieldqty4.setBounds(150,200,50,30);
        
        labelmakanan5 = new JLabel("Makanan5");
        labelmakanan5.setBounds(45,250,100,30);
        
        fieldqty5 = new JTextField();
        fieldqty5.setBounds(150,250,50,30);
        
        buttonsubmit = new JButton("Next");
        buttonsubmit.setBounds(100,300,100,30);
        
        buttoncancel = new JButton("Cancel");
        buttoncancel.setBounds(300,300,100,30);
        
        frame.add(labeljudul);
        frame.add(labelmakanan1);
        frame.add(buttonsubmit);
        frame.add(fieldqty1);
        frame.add(labelmakanan2);
        frame.add(fieldqty2);  
        frame.add(labelmakanan3);
        frame.add(fieldqty3);
        frame.add(labelmakanan4);
        frame.add(fieldqty4);
        frame.add(labelmakanan5);
        frame.add(fieldqty5);
        frame.add(buttoncancel);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         String command = ae.getActionCommand();
        switch(command){
            case"Next":
              frame.setVisible(false);
                new PembayaranFoodScreen();                           
            break;
            case"Cancel":
                frame.setVisible(false);
                new GoFoodScreen();
            default:
                break;
        }
    }
}
