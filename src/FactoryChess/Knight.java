package FactoryChess;

public class Knight {
    private static int count;
    private Knight(String color){
        System.out.println("Knight "+color+" is created.");
    }
    public static Knight create(String color){
        count++;
        if (count<=2){
            return new Knight(color);
        }
        else throw new StackOverflowError();
    }
}
