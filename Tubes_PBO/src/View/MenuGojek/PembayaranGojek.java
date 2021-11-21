/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MenuGojek;

import View.CustomerScreen;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Sebastian Berto
 */
public class PembayaranGojek implements ActionListener{
    private JFrame framepembayarangojek = new JFrame();
    private JLabel labelnamapemesan, labelnamadriver, labelalamatjemput, labelalamattujuan,labeljarak, labeltotalharga,
            labelisinamapemesan, labelisinamadriver, labelisialamatjemput, labelisialamattujuan, labelisijarak, labelisitotalharga,
            labelmetodepembayaran , labelnominal,labeljudul;
    private JComboBox cBmetodepembayaran;
    private JTextField fieldnominal;
    private JButton buttonBack, buttonSubmit, buttonCancel;
    
    public PembayaranGojek(){
        framepembayarangojek.setSize(900,800);
        framepembayarangojek.setLocationRelativeTo(null);
        framepembayarangojek.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //Label
        labeljudul = new JLabel("PEMBAYARAN");
        labeljudul.setBounds(300,20,300,50);
        labeljudul.setFont(new Font(labeljudul.getFont().getName(), labeljudul.getFont().getStyle(), 28));
        
        labelnamapemesan = new JLabel("Nama Pemesan: ");
        labelnamapemesan.setBounds(20,80,100,50);
                
        labelnamadriver = new JLabel("Nama Driver: ");
        labelnamadriver.setBounds(20,120,100,50);
        
        labelalamatjemput = new JLabel("Alamat Penjemputan: ");
        labelalamatjemput.setBounds(20,160,150,50);
                
        labelalamattujuan= new JLabel("Alamat Tujuan: ");        
        labelalamattujuan.setBounds(20,200,100,50);
        
        labeljarak = new JLabel("Jarak : ");
        labeljarak.setBounds(20,240,100,50);
        
        labeltotalharga = new JLabel("Total Harga: ");
        labeltotalharga.setBounds(20,280,100,50);
        
        labelmetodepembayaran = new JLabel("Pilih Metode Pembayarannya: ");
        labelmetodepembayaran.setBounds(20,320,170,50);
        
        labelnominal = new JLabel("Nominal: ");
        labelnominal.setBounds(20,380,100,50);
        
        labelisinamapemesan = new JLabel("Ini isi nama PEMESAN nanti dirubah");
        labelisinamapemesan.setBounds(230,80,300,50);
        
        labelisinamadriver = new JLabel("Ini isi nama DRIVER nanti dirubah");
        labelisinamadriver.setBounds(230,120,300,50);
        
        labelisialamatjemput = new JLabel("Ini isi ALAMAT JEMPUT nanti dirubah");
        labelisialamatjemput.setBounds(230,160,300,50);
        
        labelisialamattujuan = new JLabel("Ini isi ALAMAT TUJUAN nanti dirubah");
        labelisialamattujuan.setBounds(230,200,300,50);
        
        labelisijarak = new JLabel("Ini isi JARAK nanti dirubah");
        labelisijarak.setBounds(230,240,300,50);
        
        labelisitotalharga = new JLabel("Ini isi TOTAL HARGA nanti dirubah");
        labelisitotalharga.setBounds(230,280,300,50);
        
        //Combo Box
        cBmetodepembayaran = new JComboBox();
        cBmetodepembayaran.setBounds(230,320,170,50);
        
        //Text Field
        fieldnominal = new JTextField("ISI NOMINAL DISIN");
        fieldnominal.setBounds(230,380,300,50);
        
        //Button
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(100,500,100,50);
        buttonSubmit.addActionListener(this);
        
        buttonBack = new JButton("Back");
        buttonBack.setBounds(300,500,100,50);
        buttonBack.addActionListener(this);
        
        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(500,500,200,50);
        buttonCancel.addActionListener(this);
        
        framepembayarangojek.add(labeljudul);
        framepembayarangojek.add(labelnamapemesan);
        framepembayarangojek.add(labelnamadriver);
        framepembayarangojek.add(labelalamatjemput);
        framepembayarangojek.add(labelalamattujuan);
        framepembayarangojek.add(labeljarak);
        framepembayarangojek.add(labeltotalharga);
        framepembayarangojek.add(labelmetodepembayaran);
        framepembayarangojek.add(labelnominal);
        framepembayarangojek.add(labelisinamapemesan);
        framepembayarangojek.add(labelisinamadriver);
        framepembayarangojek.add(labelisialamatjemput);
        framepembayarangojek.add(labelisialamattujuan);
        framepembayarangojek.add(labelisijarak);
        framepembayarangojek.add(labelisitotalharga);
        framepembayarangojek.add(fieldnominal);
        framepembayarangojek.add(cBmetodepembayaran);
        framepembayarangojek.add(buttonBack);
        framepembayarangojek.add(buttonSubmit);
        framepembayarangojek.add(buttonCancel);
        
        framepembayarangojek.setLayout(null);
        framepembayarangojek.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command){
            case "Submit":
                //
            break;
            case "Back":
                framepembayarangojek.setVisible(false);
                new MenuGojek();
            break;
            case "Cancel":
                framepembayarangojek.setVisible(false);
                new CustomerScreen();
        }
    }
    
}
