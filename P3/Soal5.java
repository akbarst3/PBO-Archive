import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String platNomor = scan.nextLine();
        String gabungan = platNomor.replace(" ", "");
        long angka = Long.parseLong(gabungan);
        long hasil = angka - 999999;
        if (hasil % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
        scan.close();
    }
}
