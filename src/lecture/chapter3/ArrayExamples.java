package lecture.chapter3;

import java.util.Arrays;

public class ArrayExamples {

  static void main() {

    int[] luckyNumbers;

    luckyNumbers = new int[5];

    luckyNumbers[0] = 42;
    luckyNumbers[1] = 13;
    luckyNumbers[2] = 23;
    luckyNumbers[3] = 22;
    luckyNumbers[4] = 23;

    System.out.println(luckyNumbers[1]);

    byte[] myPinCode = {2,2,2,2};
    System.out.println(myPinCode[3]);

    System.out.println("Anzahl Zahlen im Pincode: " + myPinCode.length);

    System.out.println(Arrays.toString(myPinCode));


    char[][] tictactoe = new char[3][3];

    tictactoe[1][1] = 'X';
    tictactoe[1][2] = 'O';



    String[][][] book = new String[5][][];

    // Book - Chapter 1 (index 0)
    book[0] = new String[3][];

    // Book - Chapter 1 - Sentence 1
    book[0][0] = new String[3];

    book[0][0][0] = "Hallo";
    book[0][0][1] = "liebe";
    book[0][0][2] = "Lesendeperson";


  }
}
