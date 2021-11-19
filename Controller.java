package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField chat;
    @FXML
    TextArea mainTextAreaSend;

    public static String COUNTER;

    public void btnOneClickAction(ActionEvent actionEvent) {

       mainTextAreaSend.appendText(chat.getText() + "\n");
       chat.clear();

    }


}
