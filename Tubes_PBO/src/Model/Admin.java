/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asus
 */
public class Admin extends User implements InterfaceAdmin{

    public Admin(String nama, String alamat, String username, String password) {
        super(nama, alamat, username, password);
    }

       
}
