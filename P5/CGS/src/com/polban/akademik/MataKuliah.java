package com.polban.akademik;

public class MataKuliah {
    private String kodeMk;
    private String namaMataKuliah;

    public MataKuliah(String kodeMk, String namaMataKuliah) {
        this.kodeMk = kodeMk;
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }
}

