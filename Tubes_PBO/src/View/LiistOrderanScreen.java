/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yudistira;

/**
 *
 * @author yudis
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LiistOrderanScreen {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;

   public LiistOrderanScreen(){
      prepareGUI();
   }
   public static void main(String[] args){
      LiistOrderanScreen  swingContainerDemo = new LiistOrderanScreen();  
      swingContainerDemo.showJFrameDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("List Orderan");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(350,100);
      msglabel = new JLabel("List Orderan ", JLabel.CENTER);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showJFrameDemo(){
      headerLabel.setText("Daftar Orderan ");   
      final JFrame frame = new JFrame();
      frame.setSize(300, 300);
      frame.setLayout(new FlowLayout());       
      frame.add(msglabel);
      
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            frame.dispose();
         }        
      });    
      JButton okButton = new JButton("Lihat List");
      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Halaman Pengguna ");
            frame.setVisible(true);
         }
      });
      controlPanel.add(okButton);
      mainFrame.setVisible(true);  
   }
}

