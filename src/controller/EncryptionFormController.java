package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.crypto.DEP7Crypto;
//import util.DEP7Crypto;

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

        txtCypher.setText(DEP7Crypto.encrypt(text,key));
    }
}