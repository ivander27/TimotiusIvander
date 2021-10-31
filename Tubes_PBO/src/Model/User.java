/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Controller;
import Controller.CustomerManager;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class User {
    private String nama;
    private String alamat;
    private String username;
    private String password;

    public User(String nama, String alamat, String username, String password) {
        this.nama = nama;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean cekRegister(String username, String email){
        ArrayList<User> User = Controller.getAllUsers();
        int i = 0;
        boolean status = true;
        while(status && i < User.size()){
            if(username.equals(User.get(i).getUsername())){
                status = false;
            }
            i++;
        }
        return status;
    }
        
    public String cekLogin(String username, String password){
        int i = 0;
        ArrayList<User> allUser = new ArrayList<>();
        String tipe = "";
        boolean status = false;
        
        while (status == false && i < allUser.size()) {
            if(allUser.get(i) instanceof Customers){
                Customers customer = (Customers) allUser.get(i);
                if(username.equals(customer.getUsername()) && password.equals(customer.getPassword())){
                    CustomerManager.getInstance().setCustomer(customer);
                    status = true;
                    tipe = "Customer";
                }
            }
            i++;
        }
        return(tipe);
    }
}
