package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Main extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        //Task 02 a
        Path path = new Path();

        Group group = new Group(path);

        Scene scene = new Scene(group, 600, 600);
        //височина
        double height=scene.getHeight();
        //ширината
        double width=scene.getWidth();
        //при всяко действие на цикъла създаваме нова линия местейки нейните координати

        int count=0;
        int index=0;


        for(index=0;index<25;count++,index++)
        {
            Line line=new Line(0, count*25,count*25, height);
            line.setStroke(Color.RED);
            group.getChildren().add(line);
        }
        count=0;


        for(index=0;index<25;count++,index++)
        {
            Line line = new Line(count * 25, scene.getHeight(), scene.getWidth(), height -= 25);
            line.setStroke(Color.RED);
            group.getChildren().add(line);
        }
        count=0;


        for(index=0;index<25;count++,index++)
        {
            Line line=new Line(count*25,0,scene.getWidth(),count*25);
            line.setStroke(Color.RED);
            group.getChildren().add(line);
        }
        count=0;

        for(index=0;index<25;count++,index++, width-=25)
        {
            Line line=new Line(width,0,0,count*25);
            line.setStroke(Color.RED);
            group.getChildren().add(line);
        }

        stage.setTitle("HomeworkTask");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
