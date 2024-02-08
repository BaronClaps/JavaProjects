public class StringMethods {
    public static void main(String[] args){
    String name = "Jeff";


    // Check if var name = Jeff
        // boolean result = name.equals("Jeff");
    //Does not care about lower or upper case
        // boolean result = name.equalsIgnoreCase("jeff");

    // Length of var name
        // int result = name.length();

    //just used charAt to print the value of the char at the index
    for(int i=0; i<name.length(); i++){System.out.print(name.charAt(i));}

    /* Opposite of charAt / where it finds the letter
        int result = name.indexOf('f');
        System.out.println(result);
*/

        // boolean result = name.startsWith("J");
        // boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim(); //removes empty spaces
        String result = name.replace('f','l');


        System.out.println(result);







}}
