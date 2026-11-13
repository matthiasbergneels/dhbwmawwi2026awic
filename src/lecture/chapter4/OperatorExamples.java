package lecture.chapter4;

public class OperatorExamples {

  static void main(String[] args) {

    int result;

    int numberA = 5;
    int numberB = 10;

    result = numberA % numberB;

    System.out.println(numberA);

    ++numberA;  // numberA = numberA + 1;

    System.out.println(numberA);

    System.out.println(++numberA);

    numberA = 10;
    result = numberA++ + numberA++ + numberA++;     // Dumme Idee!

    System.out.println(result);

    numberA += numberB; // ==> numberA = numberA + numberB;


    // ? Operator

    numberA = 50;
    numberB = 33;

    int biggerNumber = (numberA > numberB) ?  numberA : numberB;

    boolean isRaining = false;

    String weatherPreperation = isRaining ? "Regenschirm" : "Sonnenschirm";

    System.out.println(weatherPreperation);

    // String-Verkettung

    String text1 = "Hallo";
    String text2 = "Welt";

    // Verkettung von Zeichenketten
    String greeting = "" + numberB + numberA + text1 + " " + text2 + "!" + numberA + numberB;
    System.out.println(greeting);

  }
}
