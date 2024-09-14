package com.polban.jtk.inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public void tambahStok (int jumlah) {
        stok += jumlah;
    }

    public int getStok() {
        return this.stok;
    }
}