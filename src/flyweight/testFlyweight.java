package flyweight;

public class testFlyweight {
    public testFlyweight(){
        Tower t1 = Tower.getInstance("Level 1 ");
        Tower t2 = Tower.getInstance("Level 1 ");
        Tower t3 = Tower.getInstance("Level 1 ");

        Tower t11 = Tower.getInstance("Level 2 ");
        Tower t12 = Tower.getInstance("Level 2 ");
        Tower t13 = Tower.getInstance("Level 2 ");

    }

    public static void main(String[] args) {
        new testFlyweight();
    }
}
