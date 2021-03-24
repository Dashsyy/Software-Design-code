package FinalEx5;

import java.util.HashMap;
import java.util.Map;

public class Witch {
    private static int count;
    private static Map<String,Witch> instances= new HashMap<>();
    public Witch(){}

    private Witch(String level){
        System.out.println("Witch level: "+level+" is created.");
    }
    public static Witch getInstance(String level,double dmg) {
        count++;
        if (count <= 150) {
            if (instances.containsKey(level) == false) {
                Witch witch = new Witch(level);
                witch.spell(dmg);
                instances.put(level,witch);
            } else {
                return instances.get(level);
            }
            return instances.get(level);
        }else throw new StackOverflowError("Cannot created more than 150");
    }
    public void spell(double dmg){
        System.out.println("Spell damage: "+dmg+"\n");
    }
}
