/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yudistira;

/**
 *
 * @author yudis
 */
 import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
public class LiistOrderanScreen {  
    public static void main(String s[]) {
        JFrame frame = new JFrame("List Orderan ");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel(" Daftar Oderan ");  
        JButton button1 = new JButton();  
        button1.setText("Lihat list Oderan ");  
        JButton button2 = new JButton();
        button2.setText("Kembali");  
        panel.add(label);  
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  
    

