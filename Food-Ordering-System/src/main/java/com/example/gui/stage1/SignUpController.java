package com.example.gui.stage1;

import com.example.gui.*;
import com.example.gui.system;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;

public class SignUpController {

    @FXML
    private TextField add;
    @FXML
    private TextField fname;
    @FXML
    private TextField lname;
    @FXML
    private TextField mail;
    @FXML
    private TextField num;
    @FXML
    private Text fail;
    @FXML
    private PasswordField pass1;
    @FXML
    private PasswordField pass2;
    @FXML
    private Text success;
    @FXML
    public void setNull(){
        success.setText("");
        fail.setText("");
        pass1.setText("");
        pass2.setText("");
        fname.setText("");
        lname.setText("");
        mail.setText("");
        num.setText("");
        add.setText("");
    }
    @FXML
    boolean isEmpty = false;

    @FXML
    public void checkFields() {
        TextField[] textFields = {add, fname, lname, mail, num};
        for (TextField textField : textFields){
            isEmpty = textField.getText().isEmpty();
            if(isEmpty){
               fail.setText("fill all fields");
                break;
            }
        }

    }

    @FXML
    void fillData(){
        String Fname = fname.getText();

        String userMail = mail.getText();

        String userPassword = pass1.getText();

        String userName = lname.getText();

        String userAddress = add.getText();

        String Phone = num.getText();

        User user = new User(Fname, userName, userPassword, userMail, Phone, userAddress);
        system.userList.add(user);
    }



    @FXML
    void Sign_Up(ActionEvent event) throws IOException {
        checkFields();
        if(isEmpty)return;
        if (system.fakeEmail(system.userList,mail.getText())){
            fail.setText("This Email Already Exists");
            return;
        }
        if(pass1.getText().equals(pass2.getText()) ) {
            if(pass1.getText().isEmpty() || pass2.getText().isEmpty() ){
                success.setText("");
                fail.setText("");

            }

            else {
                if(isEmpty)
                {
                    checkFields();
                    return;
                }
                fillData();
                success.setText("Signed Up Successfully!!");
                fail.setText(" ");
                HelloApplication.delay1sec(1);
                PauseTransition delay = new PauseTransition(Duration.seconds(1));
                delay.setOnFinished(Event -> setNull() );
                delay.play();

            }
        }
        else {
            success.setText(" ");
            fail.setText("Passwords are not the same");
        }
    }
    @FXML
    void switchToLogin(ActionEvent event) {
        setNull();
        HelloApplication.display(1);
    }


}