 
import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class MyJavaFxApp extends Application {
	Double[] points = new Double[]{
			0.0, 0.0,
			148.0, 25.0,
			66.0, 83.0,
	};
	Double ellipseCenterX;
	Double ellipseCenterY;
	
	private Double[] getShapeOffset(Double x, Double y){
		Double[] points = this.points.clone();
		for(int i=0; i< this.points.length; i++){
			points[i] = ellipseCenterX + x * points[i];
			points[++i] = ellipseCenterY + y * points[i];
		}
		return points;
	}
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab 1");
        
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        
        Ellipse ellipse = new Ellipse(scene.getWidth()/2, scene.getHeight()/2, 15, 87/2);
        ellipse.setFill(Color.web("#ADFF2F"));
        this.ellipseCenterX = ellipse.getCenterX();
        this.ellipseCenterY = ellipse.getCenterY();
        
		root.getChildren().add(ellipse);
		Double ellipseCenterCoordinateX = ellipse.getCenterX();
		Double ellipseCenterCoordinateY = ellipse.getCenterX();
		Polygon leftUpWing = new Polygon();
		
		leftUpWing.getPoints().addAll(this.getShapeOffset(-1.0, -1.0));
		leftUpWing.setFill(Color.web("0x00FFFF"));
		root.getChildren().add(leftUpWing);
		Polygon leftDownWing = new Polygon();
		leftDownWing.getPoints().addAll(this.getShapeOffset(-1.0, 1.0));
		leftDownWing.setFill(Color.web("0x00FFFF"));
		root.getChildren().add(leftDownWing);
		
		Polygon rightUpWing = new Polygon();
		rightUpWing.getPoints().addAll(this.getShapeOffset(1.0, -1.0));
		rightUpWing.setFill(Color.web("0x00FFFF"));
		root.getChildren().add(rightUpWing);
		
		Polygon rightDownWing = new Polygon();
		rightDownWing.getPoints().addAll(this.getShapeOffset(1.0, 1.0));
		rightDownWing.setFill(Color.web("0x00FFFF"));
		root.getChildren().add(rightDownWing);
		
		Line line1 = new Line();
		line1.setStartX(this.ellipseCenterX - 3);
		line1.setStartY(this.ellipseCenterY - 25);
		line1.setEndX(this.ellipseCenterX - 12);
		line1.setEndY(7.5);
		line1.setFill(Color.web("#C4C4C4"));
		Line line2 = new Line();
		line2.setStartX(this.ellipseCenterX + 3);
		line2.setStartY(this.ellipseCenterY - 25);
		line2.setEndX(this.ellipseCenterX + 12);
		line2.setEndY(7.5);
		line2.setFill(Color.web("#C4C4C4"));
		
		root.getChildren().add(line1);
		root.getChildren().add(line2);
		
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}