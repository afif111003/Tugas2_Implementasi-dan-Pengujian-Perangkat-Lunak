/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.autocarrpl;

/**
 *
 * @author LENOVO
 */
public class AutoCarRPLMain {

    public static void main(String[] args) {
        // Membuat objek Setir dan Fuel untuk dimasukkan ke dalam AutoCarRPL
        Setir setir = new Setir();
        Fuel fuel = new Fuel();

        // Membuat instance dari AutoCarRPL
        AutoCarRPL autoCar = new AutoCarRPL(setir, fuel);
        autoCar.setBahanBakar("Bensin");
        autoCar.setKecepatan(80);

        // Memulai dan menjalankan mobil
        autoCar.start();
        autoCar.drive();

        // Membuat instance dari Mio (pewarisan dari AutoCarRPL)
        Mio mio = new Mio(setir, fuel);
        mio.setBahanBakar("Solar");
        mio.setKecepatan(60);

        // Memulai dan menjalankan Mio
        mio.start();
        mio.drive();
        mio.fiturTambahan();
    }
}
