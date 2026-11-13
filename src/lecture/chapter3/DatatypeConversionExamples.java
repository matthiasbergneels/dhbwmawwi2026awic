package lecture.chapter3;

public class DatatypeConversionExamples {

  public static void main() {

    int sourceNumber = 123;

    char sourceChar = 'A';

    double targetNumber;

    // implizite Typkonvertierung
    targetNumber = sourceNumber;

    System.out.println(sourceNumber);
    System.out.println(targetNumber);

    sourceNumber = sourceChar;
    System.out.println(sourceChar);
    System.out.println(sourceNumber);

    // Explizite Typkonvertierung

    // double -> int
    targetNumber = 3.14;
    sourceNumber = (int) targetNumber;
    System.out.println(targetNumber);
    System.out.println(sourceNumber);


    byte sourceByte = 127;

    // byte --> int
    sourceNumber = sourceByte;
    System.out.println("Byte: " + sourceByte);
    System.out.println("int: " + sourceNumber);

    // int --> byte
    sourceNumber = 129;
    sourceByte = (byte)sourceNumber;
    System.out.println("Byte: " + sourceByte);
    System.out.println("int: " + sourceNumber);

  }
}
