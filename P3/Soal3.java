import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        String gabungan = str.replace(" ", "");

        char simbol = 0;
        int indeksOperator = -1;

        for (int i = 0; i < gabungan.length(); i++) {
            char c = gabungan.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                simbol = c;
                indeksOperator = i;
                break;
            }
        }

        if (indeksOperator == -1) {
            System.out.println("Operator tidak ditemukan.");
            return;
        }

        String angka1 = gabungan.substring(0, indeksOperator);
        String angka2 = gabungan.substring(indeksOperator + 1);

        int op1 = Integer.parseInt(angka1);
        int op2 = Integer.parseInt(angka2);

        int result;
        switch (simbol) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                if (op2 == 0) {
                    System.out.println("Error: Pembagian dengan nol.");
                    return;
                }
                result = op1 / op2;
                break;
            case '%':
                if (op2 == 0) {
                    System.out.println("Error: Modulo dengan nol.");
                    return;
                }
                result = op1 % op2;
                break;
            default:
                System.out.println("Operator tidak dikenali.");
                return;
        }

        System.out.println(result);
    }
}
