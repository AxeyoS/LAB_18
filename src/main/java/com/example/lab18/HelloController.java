package com.example.lab18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField textf;
    @FXML
    private TextArea texta;
    @FXML
    private Button button;
    @FXML
    protected void Bt(ActionEvent event){
        String s=textf.getText();
        texta.appendText(s + '\n');
        textf.setText(" ");
        textf.requestFocus();
    }

}
