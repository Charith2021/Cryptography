package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class DecryptionFormController {


    public TextField txtDCypher;
    public TextField txtDKey;
    public TextField txtDText;

    public void btnDecrypt_OnAction(ActionEvent actionEvent) {

            String cypherText= txtDCypher.getText();
            String key = txtDKey.getText();

            if (cypherText.trim().isEmpty()) {
                new Alert(Alert.AlertType.ERROR, "Please enter a valid cypher text", ButtonType.OK).show();
                txtDCypher.requestFocus();
                return;
            }
            if (key.trim().isEmpty()) {
                new Alert(Alert.AlertType.ERROR, "Please enter a valid key", ButtonType.OK).show();
                txtDKey.requestFocus();
                return;
            }
           /* text += key;
            String reversedText = "";
            for (int i = text.length() - 1; i >= 0; i--) {        //the reversed text comes from here
                reversedText += text.charAt(i);
            }

            String cipherText = "";
            for (int i = 0; i <reversedText.length(); i++) {
                int code=reversedText.charAt(i);    //reversedText.charAt(i) --meken api reverse kara ganipu text eke eka akura gane aragena int ekakata dagannawa
                code+=10;                      //udadi int ekak athulata da gatthe nathnam 10k ekathu karaganna baruwa yanawa
                char newChar=(char) code;
                cipherText+=newChar;
            }
            txtDText.setText(cipherText); */

             String reversedText="";
            for (int i = 0; i < cypherText.length(); i++) {
                int code=cypherText.charAt(i);   //cypher text eke tiyana eka akura gane gannawa
                code-=10;   //eken 10 k adu karanawa.kalin ekathu karapu 10
                char originalChar=(char) code;
                reversedText+=originalChar;
            }

            String originalText="";
            for (int i =reversedText.length()-1; i >=0 ; i--) {
                originalText+=reversedText.charAt(i);

            }
            originalText=originalText.substring(0,originalText.length()-key.length()); //original text eken key eka ayn kranawa nathnam key ekath ekka output eka waddinne
            txtDText.setText(originalText);


        }
    }




