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
public class Restaurant {
    private int id_retaurant;
    private String namarestaurant;
    private String alamatrestaurant;
    private ArrayList<Food>food;

    public Restaurant() {
    }

    public Restaurant(int id_retaurant, String namarestaurant, String alamatrestaurant, ArrayList<Food> food) {
        this.id_retaurant = id_retaurant;
        this.namarestaurant = namarestaurant;
        this.alamatrestaurant = alamatrestaurant;
        this.food = food;
    }

    public int getId_retaurant() {
        return id_retaurant;
    }

    public void setId_retaurant(int id_retaurant) {
        this.id_retaurant = id_retaurant;
    }

    public String getNamarestaurant() {
        return namarestaurant;
    }

    public void setNamarestaurant(String namarestaurant) {
        this.namarestaurant = namarestaurant;
    }

    public String getAlamatrestaurant() {
        return alamatrestaurant;
    }

    public void setAlamatrestaurant(String alamatrestaurant) {
        this.alamatrestaurant = alamatrestaurant;
    }

    public ArrayList<Food> getFood() {
        return food;
    }

    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }
    
}
