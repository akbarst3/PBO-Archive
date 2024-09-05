import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] s = new String[3];
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            s[i] = scan.next();
            num[i] = scan.nextInt();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", s[i], num[i]);
        }
        System.out.println("================================");

        scan.close();
    }
}
