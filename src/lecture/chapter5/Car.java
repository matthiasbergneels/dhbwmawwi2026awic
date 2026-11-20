package lecture.chapter5;

public class Car {

  public static final String COLOR_RED = "rot";
  public static final String COLOR_GREEN = "grün";
  public static final String COLOR_BLUE = "blau";
  public static final String COLOR_BLACK = "schwarz";

  public enum Brands {
      MERCEDES("$$$"),
      LAMBORGHINI("$$$$"),
      MITSUBIHI("$$"),
      FIAT("$");

    private String priceClass;
    private Brands(String priceClass) {
      this.priceClass = priceClass;
    }

    public String getPriceClass() {
      return priceClass;
    }
  };

  // Instanz Attribute
  private String color;
  private int hp;
  private double currentSpeed;
  public final Brands BRAND;
  private String licensePlate;

  // Klassen Attribute
  private static int carCount;

  // Konstruktor
  public Car(String color, int hp, Brands brand, String licensePlate) {
    setColor(color);
    setHp(hp);
    this.BRAND = brand;
    setLicensePlate(licensePlate);

    this.currentSpeed = 0.0;
    carCount++;
  }

  Car(){
    this("blau", 120, Brands.FIAT, "HIHI");
    /*
    setColor("blau");
    setHp(120);
    this.BRAND = "Fiat";
    setLicensePlate("HIHI");

    this.currentSpeed = 0.0;
    carCount++;
     */
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

  public Brands getBrand() {
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

  @Override
  protected void finalize() {
    System.out.println("Auto der Marke " + this.BRAND + " wird verschrottet!");
    carCount--;
  }

  // Klassen Methoden
  public static int getCarCount() {
    return carCount;
  }

}
