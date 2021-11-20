/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author William
 */
public class Admin extends User{
    private boolean admin;
    
    public Admin(){
        
    }

    public Admin(boolean admin, int idUser, String nama, String alamat, String username, String password) {
        super(idUser, nama, alamat, username, password);
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
}