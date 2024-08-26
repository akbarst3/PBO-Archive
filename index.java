import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Aplikasi Penghitung Nilai Siswa");
        System.out.print("Nilai Tugas: ");
        int tugas = scanner.nextInt();
        System.out.print("Nilai UTS: ");
        int uts = scanner.nextInt();
        System.out.print("Nilai UAS: ");
        int uas = scanner.nextInt();
        char grade = index_nilai(tugas, uts, uas);
        System.out.print("Grade: " + grade);
        System.out.println();

        scanner.close();
    }

    public static char index_nilai(int tugas, int uts, int uas) {
        float nilaiAkhir = (0.2f * tugas) + (0.35f * uts) + (0.45f * uas);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        char grade;
        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 75) {
            grade = 'B';
        } else if (nilaiAkhir >= 65) {
            grade = 'C';
        } else if (nilaiAkhir >= 55) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        return grade;
    }
}
