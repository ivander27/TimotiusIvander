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
public class Driver extends User{
    private String jeniskendaraan;
    private String platnomor;
    private int pendapatan;
    private int status;
    private ArrayList<Pesanan> pesanan;

    public Driver(String jeniskendaraan, String platnomor, int pendapatan, int status, ArrayList<Pesanan> pesanan, String nama, String alamat, String username, String password) {
        super(nama, alamat, username, password);
        this.jeniskendaraan = jeniskendaraan;
        this.platnomor = platnomor;
        this.pendapatan = pendapatan;
        this.status = status;
        this.pesanan = pesanan;
    }

    public String getJeniskendaraan() {
        return jeniskendaraan;
    }

    public String getPlatnomor() {
        return platnomor;
    }

    public int getPendapatan() {
        return pendapatan;
    }

    public int getStatus() {
        return status;
    }

    public ArrayList<Pesanan> getPesanan() {
        return pesanan;
    }

    public void setJeniskendaraan(String jeniskendaraan) {
        this.jeniskendaraan = jeniskendaraan;
    }

    public void setPlatnomor(String platnomor) {
        this.platnomor = platnomor;
    }

    public void setPendapatan(int pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPesanan(ArrayList<Pesanan> pesanan) {
        this.pesanan = pesanan;
    }
    
    
}
