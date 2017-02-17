package HelloWorld;
 
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class MyJavaFXApplication extends Application {
       
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Hello World!");
        
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
   
/*
        Rectangle r = new Rectangle();
        r.setX(50);
        r.setY(50);
        r.setWidth(200);
        r.setHeight(100);
        //r.setArcWidth(20);
        //r.setArcHeight(20);
        root.getChildren().add(r);
//*/
/*
        Rectangle r = new Rectangle(50, 50, 200, 100);
        root.getChildren().add(r);
        r.setFill(Color.YELLOW);
//      r.setFill(rgb(255, 255, 0));
        scene.setFill(Color.GREEN);
        Line l = new Line(100, 100, 200, 100);
        root.getChildren().add(l);
        l.setStroke(Color.RED);
        
//*/
/*
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            0.0, 0.0,
            200.0, 100.0,
            100.0, 200.0, 10.0});
        root.getChildren().add(polygon);
//*/
/*
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
            0.0, 0.0,
            200.0, 100.0,
            100.0, 200.0 });
        root.getChildren().add(polyline);
//*/
/*
        Circle circle = new Circle();
        circle.setCenterX(100.0f);
        circle.setCenterY(100.0f);
        circle.setRadius(50.0f);
        root.getChildren().add(circle);
//*/
/*
        Ellipse ellipse = new Ellipse(50,50,50,25);
        root.getChildren().add(ellipse);
//*/    
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
