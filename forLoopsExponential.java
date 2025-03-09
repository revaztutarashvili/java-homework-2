// ეს პროგრამა საშუალებას გვაძლევს რიცხვი ავიყვანოთ ხარისხში;
//ეს პროგრამა კლიენტს არჩევინებს ჯერ ფუძეს, შემდეგ კი ხარისხს და აბრუნებს პასუხს.
import java.util.Scanner;
public class forLoopsExponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("გთხოვთ შემოიტანოთ რიცხვი, რომელიც გსურთ ხარისხში აიყვანოთ (ფუძე): ");
        int base = scanner.nextInt();
        System.out.println("გთხოვთ შემოიტანოთ ციფრი, რომელიც განისაზღვრება ხარისხად : ");
        int exponent = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        System.out.println(base + " ხარისხად "+ exponent +" უდრის " +result+"-ს");
    }
}