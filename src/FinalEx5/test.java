package FinalEx5;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        Witch witch1 = Witch.getInstance("Level 1",13.5);

        Wizard wizard1 = Wizard.getInstance("Level 1", 50);


        ArrayList list = new ArrayList<>();
        //add witch to list
        list.add(Wizard.getInstance("Level 2",16));

        //add wizard to list
        list.add(Wizard.getInstance("level 2",55));

        System.out.println(list);

    }
}
