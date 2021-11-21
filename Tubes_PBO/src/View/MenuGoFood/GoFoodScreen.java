/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MenuGoFood;

import Model.Restaurant;
import View.CustomerScreen;
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
public class GoFoodScreen extends JFrame implements ActionListener {
    private JFrame frame;
    private JLabel restaurantlabel,labeljudul,labeltujuan;
    private JTextField fieldtujuan;
    private JButton buttonsubmit,buttonback;
    private JComboBox restaurant;
    private ArrayList<Restaurant> listresto = new ArrayList<>();
    public GoFoodScreen(){
        frame = new JFrame("Go Food");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        labeljudul = new JLabel("Silahkan Pilih ");
        labeljudul.setBounds(160, 10, 200, 30);
        
        restaurantlabel = new JLabel("Pilih Restaurant");
        restaurantlabel.setBounds(45,50,100,30);
        
        //DatabaseController controller = new DatabaseController();
        //listresto = controller.getCategoryUser();
        //int banyak = listresto.size();
        //String[] resto = new String[banyak];
        //for(int i = 0 ; i < listresto.size(); i++){
        //    resto[i] = listresto.get(i).getNamarestaurant();
        //}
        restaurant = new JComboBox();
        restaurant.setBounds(150, 50, 200, 30);
        
        labeltujuan = new JLabel("Alamat Tujuan");
        labeltujuan.setBounds(45,100,100,30);
        
        fieldtujuan = new JTextField();
        fieldtujuan.setBounds(150,100,200,30);
        
        buttonsubmit = new JButton("Next");
        buttonsubmit.setBounds(150,150,100,30);
        buttonback.addActionListener(this);
        
        buttonback = new JButton("Back");
        buttonback.addActionListener(this);
        buttonback.setBounds(150,200,100,30);
        
        frame.add(labeljudul);
        frame.add(fieldtujuan);
        frame.add(buttonsubmit);
        frame.add(buttonback);
        frame.add(restaurant);
        frame.add(restaurantlabel);  
        frame.add(labeltujuan);
        frame.setLayout(null);
        frame.setVisible(true);
                
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
          String command = ae.getActionCommand();
        switch(command){
            case"Next":
               frame.setVisible(false);
               new OrderFoodScreen();
            break;
            case"Back":
                frame.setVisible(false);
                new CustomerScreen();
                break;           
            default:
                break;
        }
    }
    
   
}
