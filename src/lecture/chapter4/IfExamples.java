package lecture.chapter4;

public class IfExamples {

  static void main(String[] args) {

    boolean isRaining = false;

    if(isRaining) {
      System.out.println("Regenschirm mitnehmen");
      System.out.println("Ich hasse Regen!!!");
    } else {
      System.out.println("Sonnencreme mitnehmen");
    }

    System.out.println("Haus verlassen");

    int speed = 70;

    System.out.println("Geschwindigkeitsanzeige:");
    if(speed > 50 && speed <= 60){
      System.out.println("Zu schnell :-(");
    } else if (speed > 60){
      System.out.println("Wahnsinnig oder was???");
    }else if (speed > 30  && speed <= 50){
      System.out.println("So ist gut :-) ");
    } else if( speed > 20  && speed <= 30) {
      System.out.println("bissel langsam *gähn*");
    } else if ( speed > 0  && speed <= 20){
      System.out.println("*Schnarch*");
    } else {
      System.out.println("Ungültige Geschwindigkeitsmessung!");
    }

  }
}
