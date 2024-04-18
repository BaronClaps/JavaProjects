import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6)/* always starts at 0 and ends at 5 so add 1 for six sided dice */+1;
        System.out.println(x);

}


}
