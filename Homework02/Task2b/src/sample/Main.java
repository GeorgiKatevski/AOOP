package sample;

import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Color;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Group root=new Group();
        Scene scene= new Scene(root,600,600);
        double centerX=scene.getWidth()/2;
        double centerY=scene.getHeight()/2;
        double radiusX=20;
        double radiusY=20;

        for(int index=0;index<5;index++)
        {
            Arc arc=new Arc();
            arc.setCenterX(centerX+20);
            arc.setCenterY(centerY);
            arc.setRadiusX(radiusX);
            arc.setRadiusY(radiusY);
            arc.setFill(null);
            arc.setLength(180);
            arc.setStartAngle(0);
            arc.setStroke(Color.RED);
            root.getChildren().add(arc);
            radiusX+=20;
            radiusY+=20;

            Arc secondArc=new Arc();
            secondArc.setCenterX(centerX);
            secondArc.setCenterY(centerY);
            secondArc.setRadiusX( radiusX);
            secondArc.setRadiusY( radiusY);
            secondArc.setFill(null);
            secondArc.setLength(180);
            secondArc.setStartAngle(180);
            secondArc.setStroke(Color.RED);
            root.getChildren().add(secondArc);
            radiusX+=20;
            radiusY+=20;
        }

        Arc lastArc=new Arc();
        lastArc.setCenterX(centerX+20);
        lastArc.setCenterY(centerY);
        lastArc.setRadiusX(radiusX);
        lastArc.setRadiusY(radiusY);
        lastArc.setFill(null);
        lastArc.setLength(180);
        lastArc.setStartAngle(0);
        lastArc.setStroke(Color.RED);
        root.getChildren().add(lastArc);


        scene.setFill(Color.WHITE);
        primaryStage.setTitle("Spiral");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
