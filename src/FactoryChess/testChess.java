package FactoryChess;

public class testChess {
    public static void main(String[] args) {
        try {
            Knight knight1 = Knight.create("Pink");
            Knight knight2 = Knight.create("Yellow");
            Knight knight3 = Knight.create("Yellow");
        }catch (StackOverflowError e){
            System.out.println("Cant have more than 2 knight");
        }

    }
}
