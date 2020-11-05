package openjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

//import java.awt.*;

public class Controller extends AnchorPane {

    @FXML
    private Button btnAdd;


     boolean checkEmailHelp(String string)
    {
        int count=0;
        char[] chars = string.toCharArray();
        for(int i=0;i<string.length();i++)
        {
            if(chars[i]=='@')
            {
                count++;
            }
            if(chars[i]=='.')
            {

                if(i-1>=0)
                {
                    if(!Character.toString(chars[i-1]).matches("^[a-zA-Z]"))
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
                if(i+1<string.length())
                    {
                            if(!Character.toString(chars[i+1]).matches("^[a-zA-Z]"))
                            {
                                return false;
                            }
                    }
                else
                    {
                        return false;
                    }

            }
        }
            if(count==1)
                {
                    return true;
                }
            else
                {
                    return false;
                }
    }

    boolean checkPass(String string,String duplicateString)
            {
                if(string.equals(duplicateString))
                {
                    if(string.isEmpty())
                    {
                        return false;
                    }
                    else
                        {
                        return true;
                    }
                    }
                    else
                {
                    return false;
                }
            }
boolean checkName(String string)
{
    if(string.length()>=2) {
        char[] chars = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if (!Character.toString(chars[i]).matches("^[a-zA-Z]")) {
                return false;
            }
        }

        return true;
    }
    else
    {
        return false;
    }


}
boolean checkNumber(String string)
{
    int count=0;
    char[] chars = string.toCharArray();
    if(string.length()>15 || string.length()<14)
    {
        return false;
    }
    if(chars[0]=='(' && chars[5]==')' && chars[6]=='(' && chars[14]==')') {
        for (int i = 1; i <=4; i++)
        {
           if(!Character.toString(chars[i]).matches("^[0-9]"))
           {
               return false;
           }
        }
        for(int i=7;i<14;i++)
        {
            if(!Character.toString(chars[i]).matches("^[0-9]"))
            {
                return false;
            }
        }
        return true;
    }
    else
        {
        return false;
    }

}


    @FXML
    private TextField txtInput;

     @FXML
    private javafx.scene.control.Label emailLabel;

    @FXML
    private javafx.scene.control.Label nameLabel;

    @FXML
    private javafx.scene.control.Label passLabel;

    @FXML
    private javafx.scene.control.Label numbLabel;

    @FXML
    private javafx.scene.control.Label confpassLabel;

    @FXML
    private TextField nameInput;

    @FXML
    private PasswordField passInput;

    @FXML
    private PasswordField confirmPassInput;

    @FXML
    private TextField phoneInput;




    @FXML
    public void push(javafx.event.ActionEvent event)
    {
        String input=txtInput.getText();

        if(checkEmailHelp(input)==false)
        {
            emailLabel.setText("Invalid");
        }
        else
        {
            emailLabel.setText("");
        }

        String name=nameInput.getText();
        if(checkName(name)==false)
        {
            nameLabel.setText("Invalid");
        }
        else
            {
            nameLabel.setText("");
        }
        String passInp=passInput.getText();
        String confPassIn=confirmPassInput.getText();

        if(checkPass(passInp,confPassIn)==false)
        {

            passLabel.setText("Invalid");
            confpassLabel.setText("Invalid");

        }
        else
        {
            passLabel.setText("");
            confpassLabel.setText("");
        }

        if(checkName(name)==false)
        {
            nameLabel.setText("Invalid");
        }
        else
        {
            nameLabel.setText("");
        }

        String phoneString=phoneInput.getText();
        if(!checkNumber(phoneString))
        {
            numbLabel.setText("Invalid");
        }
        else
        {
            numbLabel.setText("");
        }


    }
}
