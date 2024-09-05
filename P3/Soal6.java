import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();        
        BigInteger a = new BigInteger(str1);
        BigInteger b = new BigInteger(str2);        
        BigInteger hasilTambah = a.add(b);        
        BigInteger hasilKali = a.multiply(b);        
        System.out.println(hasilTambah);
        System.out.println(hasilKali);        
        scanner.close();
    }
}
