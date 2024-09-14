package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        for (int i = 0; i < barangs.length; i++) {
            System.out.println(barangs[i].nama_barang + "(" + barangs[i].getStok() + ")");
        }
    }

    void pengadaan() {
        initBarang();
        for (int i = 0; i < barangs.length; i++) {
            barangs[i].tambahStok(5);
        }
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
