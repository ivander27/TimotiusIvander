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
public class Pesanan {
    private int id_pesanan;
    private String namadriver;
    private String namacustomer;
    private String jeniskendaraan;
    private String date;
    private int jarak;
    private String metodepembayaran;
    private String titikawal;
    private String titikakhir;
    
    public Pesanan(){
    
    }

    public Pesanan(int id_pesanan, String namadriver, String namacustomer, String jeniskendaraan, String date, int jarak, String metodepembayaran, String titikawal, String titikakhir) {
        this.id_pesanan = id_pesanan;
        this.namadriver = namadriver;
        this.namacustomer = namacustomer;
        this.jeniskendaraan = jeniskendaraan;
        this.date = date;
        this.jarak = jarak;
        this.metodepembayaran = metodepembayaran;
        this.titikawal = titikawal;
        this.titikakhir = titikakhir;
    }

    public int getId_pesanan() {
        return id_pesanan;
    }

    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    public String getNamadriver() {
        return namadriver;
    }

    public void setNamadriver(String namadriver) {
        this.namadriver = namadriver;
    }

    public String getNamacustomer() {
        return namacustomer;
    }

    public void setNamacustomer(String namacustomer) {
        this.namacustomer = namacustomer;
    }

    public String getJeniskendaraan() {
        return jeniskendaraan;
    }

    public void setJeniskendaraan(String jeniskendaraan) {
        this.jeniskendaraan = jeniskendaraan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public String getMetodepembayaran() {
        return metodepembayaran;
    }

    public void setMetodepembayaran(String metodepembayaran) {
        this.metodepembayaran = metodepembayaran;
    }

    public String getTitikawal() {
        return titikawal;
    }

    public void setTitikawal(String titikawal) {
        this.titikawal = titikawal;
    }

    public String getTitikakhir() {
        return titikakhir;
    }

    public void setTitikakhir(String titikakhir) {
        this.titikakhir = titikakhir;
    }

    
}
