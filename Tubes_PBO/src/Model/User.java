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
    private int id_User;
    private String nama;
    private String alamat;
    private String username;
    private String password;
    
    public User(){
    
    }

    public User(int id_User, String nama, String alamat, String username, String password) {
        this.id_User = id_User;
        this.nama = nama;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
    }

    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
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
