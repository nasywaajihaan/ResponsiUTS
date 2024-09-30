/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_nasywaa;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 20000000, 2);
        System.out.println("1. Output Produk");
        System.out.println(produk1.tampilkanInfo());

        Pegawai pegawai1 = new PegawaiTetap("nasywaa jihaan", 5000000, 1000000);
        System.out.println("\n2. Output Pegawai");
        System.out.println(pegawai1.tampilkanInfo());
        Produk produk2 = new Makanan("Snack", 15000, "2022-01-07");
        Pegawai pegawai2 = new PegawaiKontrak("nasywaa jihaan", 3000000, 12);

        System.out.println("\n3. Output Polimorfisme");
        System.out.println(produk2.tampilkanInfo());
        System.out.println(pegawai2.tampilkanInfo());
    }
}