package gui;

import com_providers.CipherGenerator;
import com_providers.Result;
import com_providers.Wrapper;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.util.Optional;


public class _gui extends Application {


    @FXML
    Button quit;


    @FXML
    Button gen_a_z;

    @FXML
    Button get_a_z2;

    @FXML
    TextField seed;

    @FXML
    TextField size;



    @FXML
    void buttonOnGen_a_z(ActionEvent event)
    {
        int seed1=Integer.parseInt(seed.getText());
        int size1= Integer.parseInt(size.getText());
        Wrapper wrapper=new Wrapper(size1);
        CipherGenerator c1;
        Result result=CipherGenerator.countDistinct(wrapper.makeFixedRandom(),seed1);
        System.out.println(result.getChars());
        System.out.println(result.getData());
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Generate random sequence");
        alert.setHeaderText("Count distinct characters out of "+size1);
        alert.setContentText(result.toString());
        alert.showAndWait();
    }

    @FXML
    void buttonOnGet_a_z2(ActionEvent event)
    {
        int seed2=Integer.parseInt(seed.getText());
        int size2= Integer.parseInt(size.getText());
        Wrapper wrapper=new Wrapper(size2);
        CipherGenerator c;
        Result result2=CipherGenerator.countDistinct(wrapper.makeFixedSelection(),seed2);
        System.out.println(result2.getChars());
        System.out.println(result2.getData());
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Generate random subset");
        alert.setHeaderText("Count distinct characters out of "+size2);
        alert.setContentText(result2.toString());
        alert.showAndWait();
    }
@FXML
void buttonQuit(ActionEvent event)
{
    System.exit(0);
}




    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("_gui2.fxml"));
        Scene scene=new Scene(root,400,300);
        primaryStage.setTitle("Generate random sequence");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
