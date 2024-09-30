/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_nasywaa;

/**
 *
 * @author LENOVO
 */
class Elektronik extends Produk {
    private int garansi; // Dalam tahun

    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + ", Garansi: " + garansi + " tahun";
    }
}

