package FinalEx5;

import java.util.HashMap;
import java.util.Map;

public class Wizard extends Witch{
    private static int count;
    private static Map<String, Wizard> instances = new HashMap<>();
    public Wizard(){}

    private Wizard(String level){
        System.out.println("Wizard level: "+level+" is created.");
    }
    public static Wizard getInstance(String level,double dmg){
        count++;
        if (count<=150){
            //System.out.println("Count is "+count);
            if (instances.containsKey(level)==false){
                Wizard wizard = new Wizard(level);
                wizard.spell(dmg);
            }else {
                return instances.get(level);
            }
            return instances.get(level);
        }else throw new StackOverflowError("Cannot created more than 150");
    }

    @Override
    public void spell(double dmg) {
        super.spell(dmg);
    }
}
