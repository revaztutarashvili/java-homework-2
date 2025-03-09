import java.util.Scanner;

public class whileLoopsExponential {
    // ეს პროგრამა საშუალებას გვაძლევს რიცხვი ავიყვანოთ ხარისხში;
//ეს პროგრამა კლიენტს არჩევინებს ჯერ ფუძეს, შემდეგ კი ხარისხს და აბრუნებს პასუხს.
    public class forLoopsExponential {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("გთხოვთ შემოიტანოთ რიცხვი, რომელიც გსურთ ხარისხში აიყვანოთ (ფუძე): ");
            int base = scanner.nextInt();
            System.out.println("გთხოვთ შემოიტანოთ ციფრი, რომელიც განისაზღვრება ხარისხად : ");
            int exponent = scanner.nextInt();
            int result = 1;
            int i = 0;
            while (i < exponent) {
                result = result * base;
                i++;
            }
            System.out.println(base + " ხარისხად "+ exponent +" უდრის " +result+"-ს");
        }
    }
}
