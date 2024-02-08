public class twoDArrays {
    public static void main(String[] args) {
    int[][] myArray = new int[3][3];
    myArray[0][0] = 1;
    myArray[0][1] = 2;
    myArray[0][2] = 3;
    myArray[1][0] = 4;
    myArray[1][1] = 5;
    myArray[1][2] = 6;
    myArray[2][0] = 7;
    myArray[2][1] = 8;
    myArray[2][2] = 9;

        for(int i = 0; i<myArray.length; i++){
            System.out.println();
            for(int j = 0; j<myArray[i].length; j++){
                System.out.print(myArray[i][j] + " ");
            }

    /* All in One Line *//*
        String[][] theArray = {{"A", "B", "C"}, {"D", "E", "F"},{"G", "H", "I"}};

        for(int k = 0; k<theArray.length; k++){
        System.out.println();
        for(int l = 0; l<theArray[i].length; l++){
            System.out.print(theArray[k][l] + " ");
    }
    }
    */
}}}
