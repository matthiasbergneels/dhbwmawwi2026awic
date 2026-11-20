package lecture.chapter5;

public class CampusBar {

  static void main(String[] args) {

    Student lena = new Student(4711, "Lena");

    lena.drink(1.5);
    lena.drink(0.3);
    lena.drink(0.5, 3.5f);
    lena.drink(0.5, 200);
    lena.drink(30, 0.2);


  }
}
