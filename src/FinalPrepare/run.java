package FinalPrepare;

public class run {
    public run(){
        Airplane airplane1 = Airplane.getInstance("Red");
        airplane1.shoot("5.56");
        Airplane airplane2 = Airplane.getInstance("Blue");
        Airplane airplane3 = Airplane.getInstance("green");

        Helicopter helicopter1 = Helicopter.getInstance("Yellow");
        helicopter1.shoot("9mm");
    }

    public static void main(String[] args) {
      new run();
    }
}
