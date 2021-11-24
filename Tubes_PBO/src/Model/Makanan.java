/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sebastian Berto
 */
public class Makanan extends Restaurant{
    private int id_makanan;
    private String namaMakanan;
    private int harga;

    public Makanan(){
    
    }
    public Makanan(int id_makanan, String namaMakanan, int harga) {
        this.id_makanan = id_makanan;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
    }

    public Makanan(int id_makanan, String namaMakanan, int harga, int id_retaurant, String namarestaurant, String alamatrestaurant) {
        super(id_retaurant, namarestaurant, alamatrestaurant);
        this.id_makanan = id_makanan;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
    }

    public int getId_makanan() {
        return id_makanan;
    }

    public void setId_makanan(int id_makanan) {
        this.id_makanan = id_makanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}
