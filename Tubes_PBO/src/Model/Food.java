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
public class Food {
    private int idmakanan;
    private String namamakanan;
    Restaurant idrestaurant;
    private int hargamakanan;

    public Food() {
    }

    public Food(int idmakanan, String namamakanan, Restaurant idrestaurant, int hargamakanan) {
        this.idmakanan = idmakanan;
        this.namamakanan = namamakanan;
        this.idrestaurant = idrestaurant;
        this.hargamakanan = hargamakanan;
    }

    public int getIdmakanan() {
        return idmakanan;
    }

    public void setIdmakanan(int idmakanan) {
        this.idmakanan = idmakanan;
    }

    public String getNamamakanan() {
        return namamakanan;
    }

    public void setNamamakanan(String namamakanan) {
        this.namamakanan = namamakanan;
    }

    public Restaurant getIdrestaurant() {
        return idrestaurant;
    }

    public void setIdrestaurant(Restaurant idrestaurant) {
        this.idrestaurant = idrestaurant;
    }

    public int getHargamakanan() {
        return hargamakanan;
    }

    public void setHargamakanan(int hargamakanan) {
        this.hargamakanan = hargamakanan;
    }

    
    
    
}
