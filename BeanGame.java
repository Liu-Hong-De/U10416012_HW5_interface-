//U10416012 劉宏德

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class BeanGame extends Application  {
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane a = new Pane();
		
		Line x1 = new Line();
		x1.setStartX(150);
		x1.setStartY(0);
		x1.setEndX(150);
		x1.setEndY(50);
		
		Line x2 = new Line();
		x2.setStartX(250);
		x2.setStartY(0);
		x2.setEndX(250);
		x2.setEndY(50);
		
		Line x3 = new Line();
		x3.setStartX(150);
		x3.setStartY(50);
		x3.setEndX(0);
		x3.setEndY(400);
		
		Line x4 = new Line();
		x4.setStartX(250);
		x4.setStartY(50);
		x4.setEndX(400);
		x4.setEndY(400);
		
		Line x5 = new Line();
		x5.setStartX(0);
		x5.setStartY(400);
		x5.setEndX(0);
		x5.setEndY(500);
		
		Line x6 = new Line();
		x6.setStartX(50);
		x6.setStartY(400);
		x6.setEndX(50);
		x6.setEndY(500);
		
		Line x7 = new Line();
		x7.setStartX(100);
		x7.setStartY(400);
		x7.setEndX(100);
		x7.setEndY(500);
		
		Line x8 = new Line();
		x8.setStartX(150);
		x8.setStartY(400);
		x8.setEndX(150);
		x8.setEndY(500);
	
		Line x9 = new Line();
		x9.setStartX(200);
		x9.setStartY(400);
		x9.setEndX(200);
		x9.setEndY(500);
		
		Line x10 = new Line();
		x10.setStartX(250);
		x10.setStartY(400);
		x10.setEndX(250);
		x10.setEndY(500);
		
		Line x11 = new Line();
		x11.setStartX(300);
		x11.setStartY(400);
		x11.setEndX(300);
		x11.setEndY(500);
		
		Line x12 = new Line();
		x12.setStartX(350);
		x12.setStartY(400);
		x12.setEndX(350);
		x12.setEndY(500);
		
		Line x13 = new Line();
		x13.setStartX(400);
		x13.setStartY(400);
		x13.setEndX(400);
		x13.setEndY(500);
		
		Line x14 = new Line();
		x14.setStartX(0);
		x14.setStartY(500);
		x14.setEndX(400);
		x14.setEndY(500);
		
		a.getChildren().addAll(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14);
		
		Scene scene = new Scene(a, 400, 500);
		primaryStage.setTitle("my funny bean game");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
