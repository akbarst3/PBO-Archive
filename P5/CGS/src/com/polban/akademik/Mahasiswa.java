package com.polban.akademik;

public class Mahasiswa extends Person {
    private String nim;

    public Mahasiswa(String nama, int usia, String nim) {
        super(nama, usia);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("NIM : " + nim);
    }
}