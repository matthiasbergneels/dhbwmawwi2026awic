package lecture.chapter4;

public class LoopExamples {

  static void main(String[] args) {

    int count = 0;

    // Kopfgesteuerte Schleife
    System.out.println("Kopfgesteuert Schleife 0 - 9");

    while(count < 10) {
      if(count == 6 ){
        System.out.println("So weit wollte niemend gehen!!!");
        break;
      }
      System.out.println(count);
      count++;
    }

    // Fußgesteuerte Schleife
    System.out.println("Fußgesteuert Schleife 0 - 9");
    count = 0;
    do {
      if(count == 6 ){
        System.out.println("Zahl dessen Wert man nicht nennen darf!");
        count++;
        continue;
      }
      System.out.println(count);
      count++;
    } while(count < 10);


    // Zähler-Schleife
    System.out.println("Zähler-Schleife 0 - 9");
    for(int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // Zähler-Schleife
    System.out.println("Zähler-Schleife gerade Zahlen bis 10");
    for(int i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
    }



    int[] luckNumbers = {42, 13, 67, 7};
    System.out.println("Lucky Numbers - For Schleife:");
    for(int i = 0; i < luckNumbers.length; i++) {
      if(luckNumbers[i] == 42) {
        luckNumbers[i] = 3;
        System.out.println("Geändert auf:" +  luckNumbers[i]);
        continue;
      }
      System.out.println(luckNumbers[i]);
    }

    // For-Each
    System.out.println("Lucky Numbers - For-Schleife Schleife:");
    for(int currentLuckyNumber : luckNumbers) {
      if(currentLuckyNumber == 3) {
        currentLuckyNumber = 42;
        System.out.println("Geändert auf:" +  currentLuckyNumber);
        continue;
      }
      System.out.println(currentLuckyNumber);
    }

    System.out.println("Lucky Numbers - For-Schleife Schleife - zweiter Durchlauf:");
    for(int currentLuckyNumber : luckNumbers) {

      System.out.println(currentLuckyNumber);
    }

    // timmmmmayyyyyyyyy - Schleife
    count = 0;
    for(;;){
      if(count > 10) {
        break;
      }
      System.out.println(count);
      count += 3;
    }

  }
}
