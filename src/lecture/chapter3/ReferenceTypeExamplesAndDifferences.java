package lecture.chapter3;

import java.util.Arrays;

public class ReferenceTypeExamplesAndDifferences {

  static void main() {

    int numberA = 5;

    String myInteresstingText = "Hello World!";
    System.out.println(myInteresstingText);

    String myNotSoInteresstingText = new String("Nobody cares!");

    byte[] myPinCode = new byte[4];
    byte[] yourPinCode = {4, 4, 4, 4};


    System.out.println(myPinCode.length);
    System.out.println(myInteresstingText.length());

    int numberB;

    // Call by Value
    numberB = numberA;
    System.out.println(numberA);
    System.out.println(numberB);

    numberA = 10;
    System.out.println(numberA);
    System.out.println(numberB);


    byte[] stolenPinCode;

    // Call by Reference
    stolenPinCode = yourPinCode;

    System.out.println("Dein Pin Code: " + Arrays.toString(yourPinCode));
    System.out.println("Geklauter Pin Code: " + Arrays.toString(stolenPinCode));

    stolenPinCode[0] = 0;
    stolenPinCode[1] = 0;
    stolenPinCode[2] = 0;
    stolenPinCode[3] = 0;

    System.out.println("Dein Pin Code: " + Arrays.toString(yourPinCode));
    System.out.println("Geklauter Pin Code: " + Arrays.toString(stolenPinCode));

  }
}
