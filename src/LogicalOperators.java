import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){
        /*
         && both must be true (AND)
         || or either must be true (OR)
         ! = reverse boolean value (NOT)
        */

        /* AND */
        int temp =20;

        if (temp>30){
            System.out.println("It's hot outside!");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("It's a nice day!");
        }
        else {
            System.out.println("It's cold outside!");
        }

        /* OR */
        Scanner exit = new Scanner(System.in);
        System.out.print("Do you want to exit? Press Q to Leave ");
        String response = exit.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("Goodbye!");
        }
        else{
            System.out.println("You got this!");
        }

        /* NOT */
        System.out.print("Do you REALLY want to exit? Press Q to Leave");
        String answer = exit.next();

        if(!answer.equals("q") || !answer.equals("Q")){
            System.out.println("Thanks for Staying!");
        }
        else {
            System.out.println("Bye Bye!");
        }

    {
    }
}}
