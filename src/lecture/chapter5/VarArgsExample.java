package lecture.chapter5;

public class VarArgsExample {

  /*
  public void sumOfNumbers(int numberA, int numberB){
    System.out.println("Summe: " + (numberA + numberB));
  }

  public void sumOfNumbers(int numberA, int numberB, int numberC){
    System.out.println("Summe: " + (numberA + numberB + numberC));
  }

  public void sumOfNumbers(int numberA, int numberB, int numberC, int numberD){
    System.out.println("Summe: " + (numberA + numberB + numberC + numberD));
  }

   */

  public void sumOfNumbers(String description, int... numbers){
    int sum = 0;
    for(int number : numbers){
      sum += number;
    }

    System.out.println(description + ": " + sum);
  }

  static void main(String[] args) {
    VarArgsExample sumMachine = new VarArgsExample();

    sumMachine.sumOfNumbers("Summe aus drei Zahlen", 1, 2, 3);
    sumMachine.sumOfNumbers("Summe aus einer Zahl", 1);
    sumMachine.sumOfNumbers("Summe aus sechs Zahlen", 1, 42, 89, 100, 67, 100);

  }




}
