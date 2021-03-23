package UpdateInventory;

public class updateinvent {
    public static void main(String[] args) {
        book book1 = new book("BIE","BIE12","5");
        int quantity1 = Integer.parseInt(book1.getQuantity());
        int minus = quantity1-1;
        System.out.println("Total quantity "+quantity1+" Calculation "+minus);
        String quantityString = Integer.toString(minus);
        System.out.println("Quantity "+quantityString);



    }
}
