import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] tokens = s.split("[ ,',.,@,!']");   
        System.err.println(tokens.length);        
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
