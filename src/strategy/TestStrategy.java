package strategy;

public class TestStrategy {

    public static void main(String[] args) {
//        MD5 md5 = new MD5("abc");
//        md5.getHash();
//
//        SHA1 sha1 = new SHA1("abc");
//        sha1.getHash();

       MyEncrypt myEncrypt = new MyEncrypt("abc");
       myEncrypt.setEncryptMethod(new MD5()); //set a strategy
       System.out.println("MD5: " + myEncrypt.getHash());

        myEncrypt.setEncryptMethod(new sha1());  //set a strategy
        System.out.println("SHA1: " + myEncrypt.getHash());

    }
}
