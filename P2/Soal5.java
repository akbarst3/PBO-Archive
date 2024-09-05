/**
 * Menghitung jumlah dua angka.
 *
 * @param a angka pertama
 * @param b angka kedua
 * @return hasil penjumlahan a dan b
 */

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata1;
        String kata2;
        System.out.println("Kata pertama: ");
        kata1 = input.nextLine();
        System.out.println("Kata kedua: ");
        kata2 = input.nextLine();

        String hasil;
        int panjang = kata1.length() + kata2.length();
        int result = kata1.compareTo(kata2);
        if (result > 0) {
            hasil = "Yes";
        }
        else {
            hasil = "No";
        }

        String kataGabungan = kapitalString(kata1) + " " + kapitalString(kata2);

        System.out.println(panjang);
        System.out.println(hasil);
        System.out.println(kataGabungan);

        input.close();
    }

    public static String kapitalString(String str) {
        String hurufPertama = str.substring(0, 1).toUpperCase();
        String sisaHuruf = str.substring(1);
        return hurufPertama + sisaHuruf;
    }
}
