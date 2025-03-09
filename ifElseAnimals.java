import java.util.Objects;
import java.util.Scanner;
/*
 *ეს კოდი საშუალებას გვაძლევს მომხმარებელმა შეიყვანოს სასურველი ცხოველის სახელი, რომელიც დაუბრუნებს შესაბამისი ცხოველის სახელს ჩამოთვლილთაგან, ხოლო თუ სხვა რაიმე აკრიფა მის სახელსაც.
 * ამ კოდში შემოვიტანე ინფუთ მეთოდი (Scanner), რომელიც ჯერ არ მისწავლია ლექციაზე თუმცა მე ჩემით ვიცოდი აქამდეც და ეს საშუალებას მაძლევს კოდი სახალისო და ინტერაქციული გავხადო, ანუ წინასწარ განსაზღვრულ ცვლადებზე აღარ ვარ დამოკიდებული და შემიძლია კოდი მრავალფეროვანი გავხადო.
 * ამ კოდში გამოვიყენე ასევე ახალი მეთოდი Object.equals(a, b:) რომელმაც საშუალება მომცა input-ით შემოტანილი სტრინგი შემედარებინა წინასწარ განსაზღვრული პირობით ცვლადისათვის, რადგან როდესაც კოდი დავწერე if (animalNameInput == "cat")  {System.out.println("i am a cat"); შედეგად აბრუნებდა else ოფშენს, რადგან მიუხედავად იმისა რომ ინფათში ვწერდი cat-ს ან  dog-ს, ამათ მაინც ფოლსად აღიქვამდა.
 * */
public class ifElseAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input animal name: ");
        String animalNameInput = scanner.nextLine();
//      ბლოკი რომელიც სრულდება თუ if ქონდიშენი არის თრუ!!!
        if (Objects.equals(animalNameInput, "cat")) {
            System.out.println("i am a cat");
        }
//       ბლოკი რომელიც სრულდება თუ if ქონდიშენი არის ფოლსი და else if კი თრუ.
        else if (Objects.equals(animalNameInput, "dog")) {
            System.out.println("i am a dog");
        }
        else if (Objects.equals(animalNameInput, "pig")) {
            System.out.println("i am a dog");
        }
        else if (Objects.equals(animalNameInput, "lion")) {
            System.out.println("i am a lion");
        }
//      თუ არც პირველი და არც მეორე ქონდიშენია მართალი სრულდება else
        else {
            System.out.println(" i am a " + animalNameInput + ", i am a animal");
        }

    }



}
