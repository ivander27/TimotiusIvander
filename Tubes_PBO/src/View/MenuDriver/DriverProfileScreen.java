/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MenuDriver;


import View.DriverScreen;
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

/**
 *
 * @author Asus
 */
public class DriverProfileScreen extends JFrame implements ActionListener{
    private JFrame frame;
    private JLabel labeljudul,labelnamadriver,labeljeniskendaraan,labelplatno,labelsaldo,labelpendapatan,
            labelisinama,labelisijeniskendaraan,labelisiplatno,labelisisaldo,labelisipendapatan,labeltariksaldo;
    private JTextField fieldnominal;
    private JButton tariksaldobutton,backbutton;
    
    public DriverProfileScreen() {
        frame = new JFrame("Driver Screen");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        labeljudul = new JLabel("Data Driver ");
        labeljudul.setBounds(160, 10, 200, 30);
        
        labelnamadriver = new JLabel("Nama Driver ");
        labelnamadriver.setBounds(45,50,100,30);
        
        labelisinama = new JLabel("");
        labelisinama.setBounds(150,50,100,30);
        
        labeljeniskendaraan = new JLabel("Kendaraan");
        labeljeniskendaraan.setBounds(45,100,100,30);
        
        labelisijeniskendaraan = new JLabel("");
        labelisijeniskendaraan.setBounds(150,100,100,30);
        
        labelplatno = new JLabel("Plat Nomor");
        labelplatno.setBounds(45,150,100,30);
        
        labelisiplatno = new JLabel("");
        labelisiplatno.setBounds(150,150,100,30);
        
        labelsaldo = new JLabel("Saldo Ovo");
        labelsaldo.setBounds(45,200,100,30);
        
        labelisisaldo = new JLabel("");
        labelisisaldo.setBounds(150,200,100,30);
        
        labelpendapatan = new JLabel("Pendapatan");
        labelpendapatan.setBounds(45,250,100,30);
        
        labelisipendapatan = new JLabel("");
        labelisipendapatan.setBounds(150,250,100,30);
        
        labeltariksaldo = new JLabel("Nominal");
        labeltariksaldo.setBounds(45,300,100,30);
        
        fieldnominal = new JTextField("");
        fieldnominal.setBounds(150,300,100,30);
        
        tariksaldobutton = new JButton("TarikSaldo");
        tariksaldobutton.setBounds(70,350,100,30);
        
        backbutton = new JButton("Back");
        backbutton.setBounds(180,350,100,30);
      
        frame.add(labeljudul);
        frame.add(labelnamadriver);
        frame.add(labelisinama);
        frame.add(labeljeniskendaraan);
        frame.add(labelisijeniskendaraan);
        frame.add(labelplatno);
        frame.add(labelisiplatno);
        frame.add(labelsaldo);
        frame.add(labelisisaldo);
        frame.add(labelpendapatan);
        frame.add(labelisipendapatan);
        frame.add(labeltariksaldo);
        frame.add(fieldnominal);
        frame.add(tariksaldobutton);
        frame.add(backbutton);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command){
            case"TarikSaldo":
               frame.setVisible(false);
               
            break;
            case"Back":
                frame.setVisible(false);
                new DriverScreen();
                break;
            default:
                break;
        }
    }
    
}
