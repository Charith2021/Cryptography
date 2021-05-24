package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class EncryptionFormController {
    public TextField txtText;
    public TextField txtKey;
    public TextField txtCypher;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) {
        String text = txtText.getText();
        String key = txtKey.getText();

        if (text.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter a valid text", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        }
        if (text.trim().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter a valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }
        text += key;
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
        txtCypher.setText(cipherText);
    }
}