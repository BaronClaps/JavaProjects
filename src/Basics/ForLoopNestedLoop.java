package Basics;

import javax.swing.*;
import java.util.Scanner;

public class ForLoopNestedLoop {
    public static void main(String[] args){
        /* For loop int x = 0;

        for(int i = 0; i< 10;i++){
        x = x + 1;
        System.out.print(x);
        }


        /* Nested Loops */
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;




        /* Nested Loops */
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter the symbol you want to use: ");
        symbol = sc.next();

        for(int i = 1; i <= rows; i++){
            System.out.println();

            for (int j = 1; j <= columns; j++){
            System.out.print(symbol);
        }

    }
        sc.close();


        }
}

