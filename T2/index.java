import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        peminjam mhs1 = new peminjam();
        System.out.print("Input nama peminjam: ");
        mhs1.setNama(input.nextLine());
        System.out.print("ID peminjam: ");
        mhs1.setID(input.nextLine());
        System.out.println("nama: " + mhs1.getNama());
        System.out.println("ID: " + mhs1.getID());

        System.out.println("");
        System.out.println("Teknisi: ");
        teknisi tek1 = new teknisi();
        tek1.setNama("Bambang");
        tek1.setID("tek1234");
        System.out.println("nama: " + tek1.getNama());
        System.out.println("ID: " + tek1.getID());

        System.out.println("");
        System.out.println("Alat yang dipinjam: ");
        alat alat1 = new alat();
        alat1.setNama("Proyektor");
        alat1.setID("ALAT001");
        alat1.setJumlah((byte) 3);
        System.out.println("Nama Alat: " + alat1.getNama());
        System.out.println("ID Alat: " + alat1.getID());
        System.out.println("Jumlah Alat: " + alat1.getJumlah());
    }
}

class peminjam {
    private String nama;
    private String ID;

    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getNama() {
        return nama;
    }

    public void setID(String newID) {
        ID = newID;
    }

    public String getID() {
        return ID;
    }

}

class teknisi {
    private String nama;
    private String ID;

    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getNama() {
        return nama;
    }

    public void setID(String newID) {
        ID = newID;
    }

    public String getID() {
        return ID;
    }
}

class alat {
    private String nama;
    private String ID;
    private byte jumlah;

    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getNama() {
        return nama;
    }

    public void setID(String newID) {
        ID = newID;
    }

    public String getID() {
        return ID;
    }

    public void setJumlah(byte newJumlah) {
        jumlah = newJumlah;
    }

    public byte getJumlah() {
        return jumlah;
    }
}
