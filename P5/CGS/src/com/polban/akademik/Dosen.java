package com.polban.akademik;

public class Dosen extends Person {
    private String nip;

    public Dosen(String nama, int usia, String nip) {
        super(nama, usia);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("NIP : " + nip);
    }
}