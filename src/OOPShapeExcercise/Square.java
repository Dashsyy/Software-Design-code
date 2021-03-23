package OOPShapeExcercise;

public class Square extends Shape{
    double s;
    public Square(){

    }
    public void calculation(double a){
        //Square
        //s=a*a
        s=a*a;
    }
    @Override
    public void total() {
        System.out.println("The total of the Square is:| "+s);
    }
    @Override
    public void setS(double s) {
        this.s = s;
    }

    @Override
    public double getS() {
        return s;
    }
}
