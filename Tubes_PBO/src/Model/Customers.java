/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Customers extends User{
    private ArrayList<Pesanan> pesanan;
    private int Saldoovo;

    public Customers(ArrayList<Pesanan> pesanan, int Saldoovo, String nama, String alamat, String username, String password) {
        super(nama, alamat, username, password);
        this.pesanan = pesanan;
        this.Saldoovo = Saldoovo;
    }

    public ArrayList<Pesanan> getPesanan() {
        return pesanan;
    }

    public int getSaldoovo() {
        return Saldoovo;
    }

    public void setPesanan(ArrayList<Pesanan> pesanan) {
        this.pesanan = pesanan;
    }

    public void setSaldoovo(int Saldoovo) {
        this.Saldoovo = Saldoovo;
    }
    

    
    
   
    
}
