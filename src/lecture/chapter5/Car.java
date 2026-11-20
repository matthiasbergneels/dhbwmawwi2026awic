package lecture.chapter5;

public class Car {

  private final String COLOR_RED = "rot";
  private final String COLOR_GREEN = "grün";
  private final String COLOR_BLUE = "blau";
  private final String COLOR_BLACK = "schwarz";

  // Attribute
  private String color;
  private int hp;
  private double currentSpeed;
  public final String BRAND;
  private String licensePlate;


  // Konstruktor
  public Car(String color, int hp, String brand, String licensePlate) {
    setColor(color);
    setHp(hp);
    this.BRAND = brand;
    setLicensePlate(licensePlate);

    this.currentSpeed = 0.0;
  }

  // Methoden
  public double accelerate(double deltaSpeed){
    this.currentSpeed = currentSpeed + deltaSpeed;
    return currentSpeed;
  }

  public double brake(double deltaSpeed){
    if(currentSpeed > deltaSpeed){
      currentSpeed = currentSpeed - deltaSpeed;
    } else {
      currentSpeed = 0;
    }
    return currentSpeed;
  }

  public void fullBrake(){
    currentSpeed = 0;
  }

  // Getter Methoden
  public double getCurrentSpeed(){
    return currentSpeed;
  }

  public String getColor() {
    return color;
  }

  public String getBrand() {
    return BRAND;
  }

  public int  getHp() {
    return hp;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  // Setter Methoden
  public void setHp(int hp) {
    if (hp > 75 && hp < 700){
      this.hp = hp;
    }else {
      this.hp = 120;
    }
  }

  public void setColor(String color) {
    if(color.equals(COLOR_RED) || color.equals(COLOR_BLUE) || color.equals(COLOR_GREEN) || color.equals(COLOR_BLACK)){
      this.color = color;
    } else {
      if(this.color == null){
        this.color = COLOR_BLACK;
      }
    }
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

}
