import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nStr;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Input angka n: ");
            nStr = scanner.nextLine();

            try {
                long n = Long.parseLong(nStr); // Konversi dari String ke long
                System.out.println("n can be fitted in: ");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (NumberFormatException e) {
                System.out.println("n cant be fitted anywhere");
            }
        }

        scanner.close();
    }
}
