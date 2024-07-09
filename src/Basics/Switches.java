package Basics;

public class Switches {
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a list of values
        //default is if it finds no match
        String day = "Sunday";
        switch (day) {
            case "Sunday" -> System.out.println("Today is Sunday");
            case "Monday" -> System.out.println("Today is Monday");
            case "Tuesday" -> System.out.println("Today is Tuesday");
            case "Wednesday" -> System.out.println("Today is Wednesday");
            case "Thursday" -> System.out.println("Today is Thursday");
            case "Friday" -> System.out.println("Today is Friday");
            case "Saturday" -> System.out.println("Today is Saturday");
            default -> System.out.println("Not a day D;");
        }

}
}
