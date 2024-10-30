/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.autocarrpl;

/**
 *
 * @author LENOVO
 */
public class AutoCarRPL implements Transportasi {
    private String bahanBakar;
    private int kecepatan;
    
    // Komposisi: AutoCarRPL memiliki Mesin
    private Mesin mesin2;

    // Agregasi: AutoCarRPL memiliki array dari 4 Roda
    private Roda[] roda2;

    // Asosiasi: AutoCarRPL memiliki referensi ke Setir
    private Setir setir;

    // Asosiasi Unidirectional: AutoCarRPL memiliki referensi ke Fuel
    private Fuel fuel;

    // Constructor
    public AutoCarRPL(Setir setir, Fuel fuel) {
        this.mesin2 = new Mesin();
        this.roda2 = new Roda[4];
        for (int i = 0; i < roda2.length; i++) {
            roda2[i] = new Roda();
        }
        this.setir = setir;
        this.fuel = fuel;
    }

    // Implementasi dari interface Transportasi
    @Override
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Metode untuk memulai mobil
    public void start() {
        System.out.println("Mobil dimulai dengan bahan bakar: " + bahanBakar);
    }

    // Metode untuk mengemudikan mobil
    public void drive() {
        System.out.println("Mobil berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }
}

