package FinalEx5;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        Witch witch1 = Witch.getInstance("Level 1",13.5);

        Wizard wizard1 = Wizard.getInstance("Level 1", 50);


        ArrayList list = new ArrayList<>();
        //add witch to list
        list.add(Witch.getInstance("Level 2",16));

        //add wizard to list
        int i=1;
        while( i <151){
            list.add(Wizard.getInstance("level "+i,55));
            i++;
        }



        System.out.println(list);

    }
}
