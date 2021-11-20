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
public class PesananFood {
    private int ID_PesananFood;
    private String namarestoran;
    private ArrayList<DetailPesanan> detailpesanan;
    private int TotalHargaFood;

    public PesananFood() {
    }

    
    public PesananFood(int ID_PesananFood, String namarestoran, ArrayList<DetailPesanan> detailpesanan, int TotalHargaFood) {
        this.ID_PesananFood = ID_PesananFood;
        this.namarestoran = namarestoran;
        this.detailpesanan = detailpesanan;
        this.TotalHargaFood = TotalHargaFood;
    }

    public int getID_PesananFood() {
        return ID_PesananFood;
    }

    public void setID_PesananFood(int ID_PesananFood) {
        this.ID_PesananFood = ID_PesananFood;
    }

    public String getNamarestoran() {
        return namarestoran;
    }

    public void setNamarestoran(String namarestoran) {
        this.namarestoran = namarestoran;
    }

    public ArrayList<DetailPesanan> getDetailpesanan() {
        return detailpesanan;
    }

    public void setDetailpesanan(ArrayList<DetailPesanan> detailpesanan) {
        this.detailpesanan = detailpesanan;
    }

    public int getTotalHargaFood() {
        return TotalHargaFood;
    }

    public void setTotalHargaFood(int TotalHargaFood) {
        this.TotalHargaFood = TotalHargaFood;
    }

    
    
}
