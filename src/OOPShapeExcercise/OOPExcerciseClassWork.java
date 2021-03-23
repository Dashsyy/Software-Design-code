package OOPShapeExcercise;

import java.util.ArrayList;

public class OOPExcerciseClassWork {


    public static void main(String[] args) {
            //Arraylist of shape
            ArrayList<Shape> arrayList = new ArrayList<>();
            Circle c1 = new Circle();
            Rectangular r1 = new Rectangular();
            Square s1 = new Square();
            r1.calculation(5,5);
            s1.calculation(3);
            c1.calculation(5.5);


            arrayList.add(r1);
            arrayList.add(s1);
            arrayList.add(c1);


            for (int i=0;i<arrayList.size();i++){
                arrayList.get(i).total();

            }
        double total = s1.getS()+r1.getS()+c1.getS();
        System.out.println("Total Sum of the shape "+total);


    }


}
