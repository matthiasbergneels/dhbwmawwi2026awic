package lecture.chapter5;

public class Student {

  private String name;
  private int id;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }


  public void drink(double amountInL){
    System.out.println(name + " trinkt " + amountInL + "l");
  }

  public void drink(double amountInL, float alcoholInPercentage){
    drink(amountInL);
    System.out.println("und wird " + ((alcoholInPercentage > 20.0) ? "schnell" : "langsam") + " betrunken!");
  }

  public void drink(double amountInL, int coffeinInMg){
    drink(amountInL);
    System.out.println("und wird " + ((coffeinInMg > 150) ? "schnell" : "langsam") + " wach!");
  }

  public void drink(int electrolyteInMg, double amountInL){
    drink(amountInL);
    System.out.println("und wird " + ((amountInL > 50) ? "super" : "bisschen") + " fit!");
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
