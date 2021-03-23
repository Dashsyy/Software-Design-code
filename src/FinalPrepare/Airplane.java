package FinalPrepare;

import java.util.HashMap;
import java.util.Map;

public class Airplane {
    private static Map<String,Airplane> instances = new HashMap<>();
    public Airplane(){}
    private Airplane(String color){
        System.out.println("Airplane "+color+" is created.");
    }

    public static Airplane getInstance(String color){
        if (instances.containsKey(color)==false){
            Airplane airplane = new Airplane(color);
            instances.put(color,airplane);
        }else {
            return instances.get(color);
        }
        return instances.get(color);
    }
    public void shoot(String ammoType){
        System.out.println("Ammo type: "+ammoType);
    }
}
