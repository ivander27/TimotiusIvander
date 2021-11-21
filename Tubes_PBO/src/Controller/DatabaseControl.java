/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customers;
import Model.Pesanan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Berto
 */
public class DatabaseControl {
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static ArrayList<Customers> getAllCustomer() throws SQLException{
        ArrayList<Customers> allCustomers = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM customer";
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Customers customers = new Customers();
                customers.setId_User(rs.getInt("id_customers"));
                customers.setNama(rs.getString("nama"));
                customers.setAlamat(rs.getString("alamat"));
                customers.setUsername(rs.getString("username"));
                customers.setPassword(rs.getString("password"));
                customers.setSaldoovo(rs.getInt("saldo_ovo"));
                customers.setPesanan(getPesananCustomers(customers.getId_User()));
                allCustomers.add(customers);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }return (allCustomers);
    }
    
    public static ArrayList<Pesanan> getPesananCustomers(int idCustomers){
        ArrayList<Pesanan> allPesanan = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM pesanan WHERE id_customers=" + idCustomers;
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Pesanan pesanan = new Pesanan();
                pesanan.setId_pesanan(rs.getInt("id_pesanan"));
                pesanan.setNamacustomer(query);
                pesanan.setNamadriver(query);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
