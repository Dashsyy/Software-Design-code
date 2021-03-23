package ExConvertSHA1;

public class Converter {
    public Converter(){
        //String to sha 1 = new SHA1.getinstace
        SHA1 sha1 = SHA1.getInstance("abc");
        SHA1 sha2 = SHA1.getInstance("abcd");
        SHA1 sha3 = SHA1.getInstance("abc");
    }

    public static void main(String[] args) {
        new Converter();
    }


}
