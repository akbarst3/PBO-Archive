package com.polban.akademik;

public class Person {
    private String nama;
    private int usia;

    public Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void info() {
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
    }
}