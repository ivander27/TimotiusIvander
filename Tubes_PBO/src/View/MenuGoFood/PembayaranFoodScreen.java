/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MenuGoFood;

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

public class PembayaranFoodScreen extends JFrame implements ActionListener {
    private JFrame frame;
    private JLabel labelnamapemesan,labelnamadriver,labeljemput,labeltujuan,labeljarak,labeltotalharga,labeljudul,
            labelisinamapemesan,labelisinamadriver,labelisijemput,labelisitujuan,labelisijarak,labelisitotalharga,labelmetodebayar,
            labelnominal;
    private JTextField fieldnominal;
    private JComboBox metodebayar;
    private JButton buttonbayar,buttoncancel;
    //private ArrayList<MetodeBayar> listresto = new ArrayList<>();

    public PembayaranFoodScreen() {
        frame = new JFrame("Pembayaran");
        frame.setSize(400, 700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        labeljudul = new JLabel("Pembayaran");
        labeljudul.setBounds(150, 10, 200, 30);
        
        labelnamapemesan = new JLabel("Nama Pemesan ");
        labelnamapemesan.setBounds(45,50,100,30);
        
        labelisinamapemesan = new JLabel("");
        labelisinamapemesan.setBounds(150,50,100,30);
        
        labelnamadriver = new JLabel("Nama Driver");
        labelnamadriver.setBounds(45,100,100,30);
        
        labelisinamadriver = new JLabel("");
        labelisinamadriver.setBounds(150,100,100,30);
        
        labeljemput = new JLabel("Alamat Jemput");
        labeljemput.setBounds(45,150,100,30);
        
        labelisijemput = new JLabel("");
        labelisijemput.setBounds(150,150,100,30);
        
        labeltujuan = new JLabel("Alamat Tujuan");
        labeltujuan.setBounds(45,200,100,30);
        
        labelisitujuan = new JLabel("");
        labelisitujuan.setBounds(150,200,100,30);
        
        labeljarak = new JLabel("Jarak");
        labeljarak.setBounds(45,250,100,30);
        
        labelisijarak = new JLabel("");
        labelisijarak.setBounds(150,250,100,30);
        
        labeltotalharga = new JLabel("");
        labeltotalharga.setBounds(45,300,100,30);
        
        labelisitotalharga = new JLabel("");
        labelisitotalharga.setBounds(150,300,100,30);
        
        labelmetodebayar = new JLabel("Metode Pembayaran");
        labelmetodebayar.setBounds(45,350,100,30);
        
        //DatabaseController controller = new DatabaseController();
        //listresto = controller.getCategoryUser();
        //int banyak = listresto.size();
        //String[] resto = new String[banyak];
        //for(int i = 0 ; i < listresto.size(); i++){
        //    resto[i] = listresto.get(i).getNamarestaurant();
        //}
                
        metodebayar = new JComboBox();
        metodebayar.setBounds(150, 350, 200, 30);   
        
        labelnominal = new JLabel("Nominal");
        labelnominal.setBounds(45,400,100,30);
        
        fieldnominal = new JTextField("");
        fieldnominal.setBounds(150,400,200,30);
        
        buttonbayar = new JButton("Bayar");
        buttonbayar.setBounds(70,450,200,30);
        buttonbayar.addActionListener(this);
        
        buttoncancel = new JButton("Cancel");
        buttoncancel.setBounds(70,500,200,30);
        buttoncancel.addActionListener(this);
        
        frame.add(buttoncancel);
        frame.add(buttonbayar);
        frame.add(fieldnominal);
        frame.add(labelnominal);
        frame.add(metodebayar);
        frame.add(labelmetodebayar);
        frame.add(labelisitotalharga);
        frame.add(labeltotalharga);
        frame.add(labelisijarak);
        frame.add(labeljarak);
        frame.add(labelisitujuan);
        frame.add(labeltujuan);
        frame.add(labelisijemput);
        frame.add(labeljemput);
        frame.add(labelisinamadriver);
        frame.add(labelnamadriver);
        frame.add(labelisinamapemesan);
        frame.add(labelnamapemesan);
        frame.add(labeljudul);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command){
            case"Bayar":
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
