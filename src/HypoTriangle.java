import java.util.Scanner;

public class HypoTriangle {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner hypo = new Scanner(System.in);

        System.out.println("Side X: ");
        x = hypo.nextDouble();
        System.out.println("Side Y: ");
        y = hypo.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse: " + z);
        hypo.close();




    }
}