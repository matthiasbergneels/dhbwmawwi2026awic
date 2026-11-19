package lecture.chapter5;

public class Car {

  // Attribute
  String color;
  int hp;
  double currentSpeed;
  String brand;
  String licensePlate;

  Car(String color, int hp, String brand, String licensePlate) {
    this.color = color;
    this.hp = hp;
    this.brand = brand;
    this.licensePlate = licensePlate;

    this.currentSpeed = 0.0;
  }

  double accelerate(double deltaSpeed){
    this.currentSpeed = currentSpeed + deltaSpeed;
    return currentSpeed;
  }

  double brake(double deltaSpeed){
    if(currentSpeed > deltaSpeed){
      currentSpeed = currentSpeed - deltaSpeed;
    } else {
      currentSpeed = 0;
    }
    return currentSpeed;
  }

  void fullBrake(){
    currentSpeed = 0;
  }


}
