public class IfState {
 public static void main(String[] args) {
    int a = 10;
    int b = 10;
    int c = 10;

    if (a<1000) {
        a += b;
        System.out.println("A: " + a);
    }
    if (b<1000){
        b+=c;
        System.out.println("B:"+b);

    }


}}
