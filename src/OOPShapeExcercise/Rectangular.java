package OOPShapeExcercise;

public class Rectangular extends Shape{
    public Rectangular() {
    }
    double s;
    public void calculation(double a, double b){
        //Rectangular
        //s=a*b
        s=a*b;
    }

    @Override
    public void total() {
        System.out.println("The total of the rectangular area is:| "+s);
    }

    @Override
    public double getS() {
        return s;
    }

    @Override
    public void setS(double s) {
        this.s = s;
    }
}
