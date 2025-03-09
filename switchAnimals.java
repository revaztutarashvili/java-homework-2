import java.util.Scanner;
/*
*ეს კოდი საშუალებას გვაძლევს მომხმარებელმა შეიყვანოს სასურველი ცხოველის სახელი, რომელიც დაუბრუნებს შესაბამისი ცხოველის სახელს ჩამოთვლილთაგან, ხოლო თუ სხვა რაიმე აკრიფა მის სახელსაც.
* ამ კოდში შემოვიტანე ინფუთ მეთოდი (Scanner), რომელიც ჯერ არ მისწავლია ლექციაზე თუმცა მე ჩემით ვიცოდი აქამდეც და ეს საშუალებას მაძლევს კოდი სახალისო და ინტერაქციული გავხადო, ანუ წინასწარ განსაზღვრულ ცვლადებზე აღარ ვარ დამოკიდებული და შემიძლია კოდი მრავალფეროვანი გავხადო.
*/
public class switchAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input animal name, cat; dog; lion; pig or what you want : ");
        String animalNameInput = scanner.nextLine();

        switch (animalNameInput) {
            case "cat":
                System.out.println("i am a cat.");
                break;
            case "dog":
                System.out.println("i am a dog.");
                break;
            case "lion":
                System.out.println("i am a lion.");
                break;
            case "pig":
                System.out.println("i am a pig");
                break;
            default:
                System.out.println(" i am a " + animalNameInput + ", i am a animal.");

        }
    }
}