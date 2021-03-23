package ExConvertSHA1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class SHA1 {
    private static Map<String,SHA1> instances = new HashMap<>();
    private SHA1(){
    }
    //function to convert the String to SHA-1
    public static String SHA1Converter(String letter){
        //Algorithm credit to https://www.geeksforgeeks.org/sha-1-hash-in-java/
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            byte[] messageDigest = md.digest(letter.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            String hastext = no.toString(16);

            while (hastext.length()<32){
                hastext = "0"+hastext;
            }
            //System.out.println(hastext);
            return hastext;
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
    private SHA1(String letter){
        System.out.println("The SHA1 "+letter+" is created");
        SHA1Converter(letter);
    }

    public static SHA1 getInstance(String letter){
        if (instances.containsKey(letter) == false){
            SHA1 sha1 = new SHA1(letter);
            instances.put(letter,sha1);
            return sha1;
        }else {
            return instances.get(letter);
        }
    }
}
