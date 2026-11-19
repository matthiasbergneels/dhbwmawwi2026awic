package lecture.chapter5;

public class ParkingLotRun {

  static void main(String[] args) {

    Car myCar = new Car("Grün", 580, "Lamborghini", "HAHA");
    Car yourCar = new Car("Rot", 120, "Mitsubishi", "HOHO");

    /*
    myCar.color = "Grün";
    myCar.hp = 580;
    myCar.brand = "Lamborghini";
    myCar.licensePlate = "HAHA";

    yourCar.color = "Rot";
    yourCar.hp = 360;
    yourCar.brand = "Mitsubishi";
    yourCar.licensePlate = "HOHO";
     */

    double currentSpeedMyCar = myCar.accelerate(50);
    currentSpeedMyCar = myCar.accelerate(30);

    System.out.println("Mein Auto fährt: " + currentSpeedMyCar + " km/h");

    currentSpeedMyCar = myCar.brake(30);

    System.out.println("Mein Auto fährt: " + currentSpeedMyCar + " km/h");

    myCar.fullBrake();

    System.out.println("Mein Auto fährt: " + myCar.currentSpeed + " km/h");

    System.out.println("Mein Auto - Farbe: " + myCar.color);
    System.out.println("Mein Auto - Marke: " + myCar.brand);
    System.out.println("Mein Auto - Nummernschild: " + myCar.licensePlate);
    System.out.println("Mein Auto - Leistung: " + myCar.hp);

    yourCar.accelerate(55);
    System.out.println("Dein Auto - Farbe: " + yourCar.color);
    System.out.println("Dein Auto - Marke: " + yourCar.brand);
    System.out.println("Dein Auto - Nummernschild: " + yourCar.licensePlate);
    System.out.println("Dein Auto - Leistung: " + yourCar.hp);
    System.out.println("Dein Auto - Aktuelle Geschwindigkeit: " + yourCar.currentSpeed + " km/h");


  }

}
