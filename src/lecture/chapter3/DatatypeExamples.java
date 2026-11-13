package lecture.chapter3;

public class DatatypeExamples {

    static void main(String[] args) {

        // variable deklariert
        int numberA;

        // variable initialisiert
        numberA = 42;

        System.out.println(numberA);

        byte numberB = 5;

        char firstChar, secondChar = '6', thirdChar;

        final int COUNTDOWN;

        COUNTDOWN = 10;

        // COUNTDOWN = 5;

        final double PI = 3.14;

        // Integer Literale

        numberA = 42;
        System.out.println(numberA);
        numberA = 042;
        System.out.println(numberA);
        numberA = 0x42;
        System.out.println(numberA);
        numberA = 0b1001;
        System.out.println(numberA);
        int rgbRed = 0xFF_00_00;

        long numberC = 3_000_000_000L;

        // Gleitkommazahlen Literalen

        double numberD = 3.14;
        System.out.println(numberC);
        numberD = .14d;
        numberD = 3.;
        numberD = 3.e-2;
        System.out.println(numberD);

        float numberF = 3.14f;
        numberF = 1.2345678901234567e8f;
        System.out.println(numberF);


        // boolsche Literale
        boolean isBoring = false; // true

        // Char Literale

        firstChar = 'a';
        firstChar = '!';
        firstChar = '\'';
        firstChar = '\u2764';

      System.out.println(firstChar);

      String intelligentTextBlock = "\tHello \' World \u2764 ! \n \"toller Text\" \\";

      System.out.println(intelligentTextBlock);

      String html = "<html>\n" +
        "\t<body>\n" +
        "\t\t<p>Hello, world</p>\n" +
        "\t</body>\n" +
        "</html>";

      System.out.println(html);

      html = """
          <html>
            <body>
              <p>Hello, world</p>
            </body>
          </html>
          """;
      System.out.println(html);
    }
}
