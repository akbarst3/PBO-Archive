import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahPenjualan = scan.nextInt();
        int gajiPokok = 500000;
        int hargaPerItem = 50000;
        int gajiAkhir = gajiPokok;
        int totalPenjualan = jumlahPenjualan * hargaPerItem;
        if (jumlahPenjualan >= 80) {
            gajiAkhir += 0.35 * totalPenjualan;
        } else if (jumlahPenjualan >= 40) {
            gajiAkhir += 0.25 * totalPenjualan;
        } else if (jumlahPenjualan < 15) {
            int minusItem = 15 - jumlahPenjualan;
            double denda = 0.15 * minusItem * hargaPerItem;
            gajiAkhir -= denda;
        } else {
            gajiAkhir += 0.10 * totalPenjualan;
        }
        System.out.println(gajiAkhir);
        scan.close();
    }
}
