import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
    int a = 10;
    int b = 10;
    int c = 10;

        while(a< 1000) {
        a += b;
        System.out.println("A: " + a);
    }

        while(b< 1000) {
        b += c;
        System.out.println("B:" + b);
    }

        Scanner sc = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.print("What is your name? ");
            name = sc.nextLine();
            

        }
        System.out.print("Hello, " + name);


        do{ //do always run at least once and then checks if the condition is true
            System.out.print("What is your name? ");
            name = sc.nextLine();

        }while (name.isBlank());
        System.out.println("Hello, " + name);
}
}
