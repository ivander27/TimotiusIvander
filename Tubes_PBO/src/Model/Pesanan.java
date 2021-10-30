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
    private String namadriver;
    private String namacustomer;
    private String jeniskendaraan;
    private String date;
    private int jarak;
    private String metodepembayaran;
    private String titikawal;
    private String titikakhir;

    public Pesanan(String namadriver, String namacustomer, String jeniskendaraan, String date, int jarak, String metodepembayaran, String titikawal, String titikakhir) {
        this.namadriver = namadriver;
        this.namacustomer = namacustomer;
        this.jeniskendaraan = jeniskendaraan;
        this.date = date;
        this.jarak = jarak;
        this.metodepembayaran = metodepembayaran;
        this.titikawal = titikawal;
        this.titikakhir = titikakhir;
    }

    public String getNamadriver() {
        return namadriver;
    }

    public String getNamacustomer() {
        return namacustomer;
    }

    public String getJeniskendaraan() {
        return jeniskendaraan;
    }

    public String getDate() {
        return date;
    }

    public int getJarak() {
        return jarak;
    }

    public String getMetodepembayaran() {
        return metodepembayaran;
    }

    public String getTitikawal() {
        return titikawal;
    }

    public String getTitikakhir() {
        return titikakhir;
    }

    public void setNamadriver(String namadriver) {
        this.namadriver = namadriver;
    }

    public void setNamacustomer(String namacustomer) {
        this.namacustomer = namacustomer;
    }

    public void setJeniskendaraan(String jeniskendaraan) {
        this.jeniskendaraan = jeniskendaraan;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public void setMetodepembayaran(String metodepembayaran) {
        this.metodepembayaran = metodepembayaran;
    }

    public void setTitikawal(String titikawal) {
        this.titikawal = titikawal;
    }

    public void setTitikakhir(String titikakhir) {
        this.titikakhir = titikakhir;
    }
    
}
