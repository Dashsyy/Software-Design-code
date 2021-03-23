package strategy;
import ExConvertSHA1.SHA1;
public class sha1 extends EncryptMethod {
    @Override
    public String encrypt(String input) {
        return ExConvertSHA1.SHA1.SHA1Converter(input);
    }
}
