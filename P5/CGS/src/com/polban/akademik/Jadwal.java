package com.polban.akademik;

public class Jadwal {
    private String hari;
    private String jam;
    private Dosen dosen;
    private MataKuliah mataKuliah;
    private Ruangan ruangan;

    public Jadwal(String hari, String jam, Dosen dosen, MataKuliah mataKuliah, Ruangan ruangan) {
        this.hari = hari;
        this.jam = jam;
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
    }

    public void tampilkanJadwal() {
        System.out.println("Hari   Jam ke        Ruangan    Mata Kuliah   Dosen");
        System.out.println(hari + "   " + jam + "   " + ruangan.getKodeRuangan() + "     "
                + mataKuliah.getNamaMataKuliah() + "      " + dosen.getNama());
    }
}