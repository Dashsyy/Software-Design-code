package flyweight;

import com.company.Main;

import java.util.HashMap;
import java.util.Map;

public class Tower {
    private static Map<String, Tower> instances = new HashMap<>();
    private Tower(){}
    private Tower(String level){
        System.out.println("Tower level "+ level+ "Created.");
    }
    public static Tower getInstance(String level){
        if(instances.containsKey(level) == false){
            Tower t = new Tower(level);
            instances.put(level,t);
        }else {
            return instances.get(level);
        }
        return instances.get(level);
    }
}
