public class ExpressionsAndMath {
    public static void main(String[] args) {
        int friends = 10;
        friends += 1;
        System.out.println(friends);
        friends -= 1;
        System.out.println(friends);
        friends *= 2;
        System.out.println(friends);
        friends /= 2;
        System.out.println(friends);
        friends %= 3; //remainder
        System.out.println(friends);

        //double allows for decimal numbers
        double a = 10;
        a = (double) a/3;
        System.out.println(a);

        double x = 3.14;
        double y = -10;

        /* MATH CLASS */
        double max = Math.max(x, y);
        double min = Math.min(x, y);
        double round = Math.round(x);
        double sqrt = Math.sqrt(x);
        double ceil = Math.ceil(x);  //round up
        double floor = Math.floor(x); //round down
        System.out.println(max);
        System.out.println(min);
    }

    public static void math(String[] args) {

    }

}
