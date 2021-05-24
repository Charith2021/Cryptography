package util;

public class DEP7Crypto {
    public static String encrypt(String plainText, String key){
        plainText += key;
        String reversedText = "";
        for (int i = plainText.length() - 1; i >= 0; i--) {        //the reversed text comes from here
            reversedText += plainText.charAt(i);
        }

        String cipherText = "";
        for (int i = 0; i <reversedText.length(); i++) {
            int code=reversedText.charAt(i);    //reversedText.charAt(i) --meken api reverse kara ganipu text eke eka akura gane aragena int ekakata dagannawa
            code+=10;                      //udadi int ekak athulata da gatthe nathnam 10k ekathu karaganna baruwa yanawa
            char newChar=(char) code;
            cipherText+=newChar;
        }
    return cipherText;

    }

    public  static  String decrypt(String cipherText,String key){

        String reversedText="";
        for (int i = 0; i < cipherText.length(); i++) {
            int code=cipherText.charAt(i);
            code-=10;
            char originalChar=(char) code;
            reversedText+=originalChar;
        }

        String originalText="";
        for (int i =reversedText.length()-1; i >=0 ; i--) {
            originalText+=reversedText.charAt(i);

        }
       return originalText=originalText.substring(0,originalText.length()-key.length());


    }


}
