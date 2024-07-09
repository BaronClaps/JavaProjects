package Basics;

import java.util.Random;

public class LicensePlate {
    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();
        for(int i = 0;i<=25;i++){
            for(int j = 0;j<=25;j++){
                for(int k = 0;k<=25;k++){
                    for(int l = 0;l<=9;l++) {
                        for(int m = 0;m<=9;m++){
                            for(int n = 0;n<=9;n++){
                                System.out.println(alphabet[i] + alphabet[j] + alphabet[k] + l + m + n);
                            }
                        }
                    }
                }
            }
        }
    }
}


