/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import Model.Customers;
import Model.Driver;
import Model.Pesanan;
import Model.PesananOjek;
import Model.User;
import java.sql.PreparedStatement;
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
    
    public static User getUser(String username, String password){
        conn.connect();
        String query = "SELECT * FROM user WHERE username='" + username + "'AND password='" + password + "'";
        User user = new User();
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                user.setId_User(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setTanggallahir(rs.getString("tanggallahir"));
                user.setNoHp(rs.getString("noHP"));
                user.setTipe(rs.getInt("tipe"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    
    public static User getUserByID(int idUser){
        conn.connect();
        String query = "SELECT * FROM user WHERE id= '" + idUser + "'";
        User user = new User();
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                user.setId_User(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setTanggallahir(rs.getString("tanggallahir"));
                user.setNoHp(rs.getString("noHP"));
                user.setTipe(rs.getInt("tipe"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    
    public static Customers getCustomer(int idUser){
        conn.connect();
        String query = "SELECT * FROM customers WHERE id_user = '" + idUser + "'";
        Customers customers = new Customers();
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                User user = new User();
                DatabaseControl ctrl = new DatabaseControl();
                user = ctrl.getUserByID(idUser);
                
                customers.setId_customer(rs.getInt("id_Customers"));
                customers.setAlamat(rs.getString("alamat"));
                customers.setSaldoovo(rs.getInt("saldo"));
                
                customers.setId_User(user.getId_User());
                customers.setNama(user.getNama());
                customers.setUsername(user.getUsername());
                customers.setPassword(user.getPassword());
                customers.setEmail(user.getEmail());
                customers.setTanggallahir(user.getTanggallahir());
                customers.setNoHp(user.getNoHp());
                customers.setTipe(user.getTipe());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return customers;
    }
    public static Driver getDriver(int idUser){
        conn.connect();
        String query = "SELECT * FROM driver WHERE id_Driver = '" + idUser + "'";
        Driver driver = new Driver();
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                User user = new User();
                DatabaseControl ctrl = new DatabaseControl();
                user = ctrl.getUserByID(idUser);
                
                driver.setId_driver(rs.getInt("id_Driver"));
                driver.setJeniskendaraan(rs.getString("jenisKendaraan"));
                driver.setPlatnomor(rs.getString("platNomor"));
                driver.setPendapatan(rs.getInt("pendapatan"));
                driver.setSaldoOvo(rs.getInt("saldoOvo"));
                driver.setStatus(rs.getString("status"));
                
                driver.setId_User(user.getId_User());
                driver.setNama(user.getNama());
                driver.setUsername(user.getUsername());
                driver.setPassword(user.getPassword());
                driver.setEmail(user.getEmail());
                driver.setTanggallahir(user.getTanggallahir());
                driver.setNoHp(user.getNoHp());
                driver.setTipe(user.getTipe());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return driver;
    }
    public static Admin getAdmin(int idUser){
        conn.connect();
        String query = "SELECT * FROM admin WHERE id_Admin = '" + idUser + "'";
        Admin admin = new Admin();
        try{
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                User user = new User();
                DatabaseControl ctrl = new DatabaseControl();
                user = ctrl.getUserByID(idUser);
                
                admin.setId_admin(rs.getInt("id_Admin"));
                admin.setAlamat("alamat");
                
                admin.setId_User(user.getId_User());
                admin.setNama(user.getNama());
                admin.setUsername(user.getUsername());
                admin.setPassword(user.getPassword());
                admin.setEmail(user.getEmail());
                admin.setTanggallahir(user.getTanggallahir());
                admin.setNoHp(user.getNoHp());
                admin.setTipe(user.getTipe());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return admin;
    }
    
    public static boolean insertNewPesanan(Pesanan pesanan){
        conn.connect();
        String query = "INSERT INTO pesanan (id,idCustomer,idDriver,titikawal,titikakhir,tanggalpemesanan,metodepembayaran,totalharga,jarak) values (?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, 0);
            stmt.setInt(2, pesanan.getCustomer().getId_customer());
            stmt.setInt(3, 0);
            stmt.setString(4, pesanan.getTitikawal());
            stmt.setString(5, pesanan.getTitikakhir());
            stmt.setString(6, pesanan.getTanggalpemesanan());
            stmt.setString(7, pesanan.getMetodepembayaran());
            stmt.setInt(8, pesanan.getTotalharga());
            stmt.setInt(9, pesanan.getJarak());
            
            stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean insertNewPesananOjek(PesananOjek pesanan){
        conn.connect();
        String query = "INSERT INTO pesananojek (id_PesananOjek,id_pesanan,JenisKendaraan,StatusPesanan) values (?,?,?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, 0);
            stmt.setInt(2, pesanan.getId_pesanan());
            stmt.setString(3, pesanan.getJeniskendaraan());
            stmt.setInt(4, 1);
            
            stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
