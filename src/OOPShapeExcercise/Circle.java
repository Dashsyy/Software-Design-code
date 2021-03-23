package OOPShapeExcercise;

public class Circle extends Shape{
    //Circle
    //s=pi*r*r
    double s;
    double pi = 3.14;
    public Circle(){

    }

    @Override
    public double getS() {
        return s;
    }

    @Override
    public void setS(double s) {
        this.s = s;
    }
    public void calculation(double r){
        s=pi*r*r;
    }

    @Override
    public void total() {
        System.out.println("The total of the Square is:| "+s);
    }
}
