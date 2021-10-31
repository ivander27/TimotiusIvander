/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */

public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM User";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User User = new User();
                User.setNama(rs.getString("nama"));
                User.setAlamat(rs.getString("alamat"));
                User.setUsername(rs.getString("username"));
                User.setPassword(rs.getString("password"));
                users.add(User);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }
}  
