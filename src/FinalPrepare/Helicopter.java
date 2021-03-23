package FinalPrepare;

import java.util.HashMap;
import java.util.Map;

public class Helicopter extends Airplane{
    private static Map<String,Helicopter> instances = new HashMap<>();
    public Helicopter() {
    }
    private Helicopter(String color){
        System.out.println("Helicopter color"+ color+ "Created.");
    }

    public static Helicopter getInstance(String color){
        if (instances.containsKey(color)==false){
            Helicopter helicopter = new Helicopter(color);
            instances.put(color,helicopter);
        }else {
            return instances.get(color);
        }
        return instances.get(color);
    }
    @Override
    public void shoot(String ammo) {
        super.shoot(ammo);
    }
}
