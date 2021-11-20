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
public class DetailPesanan {
    private int ID_orderan;
    private String namamakanan;
    private String namaminuman;
    private int quantity;
    private int totalhargaorderan;

    public DetailPesanan() {
    }

    
    public DetailPesanan(int ID_orderan, String namamakanan, String namaminuman, int quantity, int totalhargaorderan) {
        this.ID_orderan = ID_orderan;
        this.namamakanan = namamakanan;
        this.namaminuman = namaminuman;
        this.quantity = quantity;
        this.totalhargaorderan = totalhargaorderan;
    }

    public int getID_orderan() {
        return ID_orderan;
    }

    public void setID_orderan(int ID_orderan) {
        this.ID_orderan = ID_orderan;
    }

    public String getNamamakanan() {
        return namamakanan;
    }

    public void setNamamakanan(String namamakanan) {
        this.namamakanan = namamakanan;
    }

    public String getNamaminuman() {
        return namaminuman;
    }

    public void setNamaminuman(String namaminuman) {
        this.namaminuman = namaminuman;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalhargaorderan() {
        return totalhargaorderan;
    }

    public void setTotalhargaorderan(int totalhargaorderan) {
        this.totalhargaorderan = totalhargaorderan;
    }

    
    
    
}
