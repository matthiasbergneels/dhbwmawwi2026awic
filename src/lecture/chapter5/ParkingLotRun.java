package lecture.chapter5;

public class ParkingLotRun {

  static void main(String[] args) {

    Car myCar = new Car("grün", 580, "Lamborghini", "HAHA");
    Car yourCar = new Car("rot", 120, "Mitsubishi", "HOHO");

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

    //yourCar.color = "schlüpfer Lila";
    yourCar.setColor("schlüpfer Lila");
    //yourCar.currentSpeed = -3562.6;
    //yourCar.hp = 5;


    double currentSpeedMyCar = myCar.accelerate(50);
    currentSpeedMyCar = myCar.accelerate(30);

    System.out.println("Mein Auto fährt: " + currentSpeedMyCar + " km/h");

    currentSpeedMyCar = myCar.brake(30);

    System.out.println("Mein Auto fährt: " + currentSpeedMyCar + " km/h");

    myCar.fullBrake();

    System.out.println("Mein Auto fährt: " + myCar.getCurrentSpeed() + " km/h");

    System.out.println("Mein Auto - Farbe: " + myCar.getColor());
    System.out.println("Mein Auto - Marke: " + myCar.getBrand());
    System.out.println("Mein Auto - Nummernschild: " + myCar.getLicensePlate());
    System.out.println("Mein Auto - Leistung: " + myCar.getHp());

    yourCar.accelerate(55);
    System.out.println("Dein Auto - Farbe: " + yourCar.getColor());
    System.out.println("Dein Auto - Marke: " + yourCar.getBrand());
    System.out.println("Dein Auto - Nummernschild: " + yourCar.getLicensePlate());
    System.out.println("Dein Auto - Leistung: " + yourCar.getHp());
    System.out.println("Dein Auto - Aktuelle Geschwindigkeit: " + yourCar.getCurrentSpeed() + " km/h");


  }

}
