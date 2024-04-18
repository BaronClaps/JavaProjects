import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("How old are you? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("What is favorite food? ");
        String food = sc.nextLine();
        System.out.println("Do you like tomatoes? Love or Hate?");
        String likesTomatoes = sc.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite food is " + food + ".");
        System.out.println("You " + likesTomatoes + " tomatoes");
        if(age < 18){ System.out.println("You are not old enough to vote.");
        }else
        {System.out.println("You are old enough to vote.");}
        if(food.equals("pizza")){ System.out.println("You should touch grass.");}
        if(food.equals("tacos")){ System.out.println("You should eat more.");}

}}


