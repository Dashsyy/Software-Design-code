package strategy;

public class MyEncrypt {

    private String text;
    private String hash;

    public void setText(String text) {
        this.text = text;
    }

    public MyEncrypt(){}

    public MyEncrypt(String text){
        this.text = text;
    }

    public void setEncryptMethod(EncryptMethod encryptMethod){
        hash = encryptMethod.encrypt(text);
    }

    public String getHash(){
        return hash;
    }

}
