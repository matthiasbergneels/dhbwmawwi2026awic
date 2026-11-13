package lecture.chapter4;

public class SwitchCaseExamples {

  static void main(String[] args) {

    byte grade = 3;

    switch(grade){
      case 1:
        System.out.println("Sehr gut");
        break;
      case 2:
        System.out.println("Gut");
        break;
      case 3:
        System.out.println("Befriedigend");
        break;
      case 4:
        System.out.println("Ausreichend");
        break;
      case 5:
        System.out.println("Mangelhaft");
        break;
      default:
        System.out.println("ungültige Note angegeben!");
    }

    switch(grade){
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("Bestanden");
        break;
      case 5:
        System.out.println("Durchgefallen");
        break;
      default:
        System.out.println("ungültige Note angegeben!");
    }


    switch(grade){
      case 1 -> System.out.println("Sehr gut");
      case 2 -> System.out.println("gut");
      case 3 -> System.out.println("Befriedigend");
      case 4 -> System.out.println("Ausreichend");
      case 5 -> System.out.println("Mangelhaft");
      default -> System.out.println("Ungültige Note angegeben!");
    }

    switch(grade){
      case 1, 2, 3, 4 -> System.out.println("Bestanden");
      case 5 -> System.out.println("Durchgefallen");
      default -> System.out.println("Ungültige Note angegeben!");
    }

    String gradeText = switch(grade){
      case 1 -> "Sehr gut";
      case 2 -> "gut";
      case 3 -> "Befriedigend";
      case 4 -> "Ausreichend";
      case 5 -> "Mangelhaft";
      default -> "Ungültige Note angegeben!";
    };

    System.out.println("Note " + grade + " bedeutet: " + gradeText);


    String day = "FRIDAY";
    int numLetters = switch (day) {
      case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
      case "TUESDAY" -> 7;
      default -> {
        int result = day.length();
        yield result;
      }
    };

  }
}
