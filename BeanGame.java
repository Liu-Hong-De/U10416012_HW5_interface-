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
		
		Circle c1 = new Circle();
		c1.setCenterX(50);
		c1.setCenterY(400);
		c1.setRadius(10);
		c1.setFill(Color.BLACK);
		
		Circle c2 = new Circle();
		c2.setCenterX(100);
		c2.setCenterY(400);
		c2.setRadius(10);
		c2.setFill(Color.BLACK);
		
		Circle c3 = new Circle();
		c3.setCenterX(150);
		c3.setCenterY(400);
		c3.setRadius(10);
		c3.setFill(Color.BLACK);
		
		Circle c4 = new Circle();
		c4.setCenterX(200);
		c4.setCenterY(400);
		c4.setRadius(10);
		c4.setFill(Color.BLACK);
		
		Circle c5 = new Circle();
		c5.setCenterX(250);
		c5.setCenterY(400);
		c5.setRadius(10);
		c5.setFill(Color.BLACK);
		
		Circle c6 = new Circle();
		c6.setCenterX(300);
		c6.setCenterY(400);
		c6.setRadius(10);
		c6.setFill(Color.BLACK);
		
		Circle c7 = new Circle();
		c7.setCenterX(350);
		c7.setCenterY(400);
		c7.setRadius(10);
		c7.setFill(Color.BLACK);
		
		Circle c8 = new Circle();
		c8.setCenterX(75);
		c8.setCenterY(350);
		c8.setRadius(10);
		c8.setFill(Color.BLACK);
		
		Circle c9 = new Circle();
		c9.setCenterX(125);
		c9.setCenterY(350);
		c9.setRadius(10);
		c9.setFill(Color.BLACK);
		
		Circle c10 = new Circle();
		c10.setCenterX(175);
		c10.setCenterY(350);
		c10.setRadius(10);
		c10.setFill(Color.BLACK);
		
		Circle c11 = new Circle();
		c11.setCenterX(225);
		c11.setCenterY(350);
		c11.setRadius(10);
		c11.setFill(Color.BLACK);
		
		Circle c12 = new Circle();
		c12.setCenterX(275);
		c12.setCenterY(350);
		c12.setRadius(10);
		c12.setFill(Color.BLACK);
		
		Circle c13 = new Circle();
		c13.setCenterX(325);
		c13.setCenterY(350);
		c13.setRadius(10);
		c13.setFill(Color.BLACK);
		
		Circle c14 = new Circle();
		c14.setCenterX(100);
		c14.setCenterY(300);
		c14.setRadius(10);
		c14.setFill(Color.BLACK);
		
		Circle c15 = new Circle();
		c15.setCenterX(150);
		c15.setCenterY(300);
		c15.setRadius(10);
		c15.setFill(Color.BLACK);

		Circle c16 = new Circle();
		c16.setCenterX(200);
		c16.setCenterY(300);
		c16.setRadius(10);
		c16.setFill(Color.BLACK);
		
		Circle c17 = new Circle();
		c17.setCenterX(250);
		c17.setCenterY(300);
		c17.setRadius(10);
		c17.setFill(Color.BLACK);
		
		Circle c18 = new Circle();
		c18.setCenterX(300);
		c18.setCenterY(300);
		c18.setRadius(10);
		c18.setFill(Color.BLACK);
		
		Circle c19 = new Circle();
		c19.setCenterX(125);
		c19.setCenterY(250);
		c19.setRadius(10);
		c19.setFill(Color.BLACK);
		
		Circle c20 = new Circle();
		c20.setCenterX(175);
		c20.setCenterY(250);
		c20.setRadius(10);
		c20.setFill(Color.BLACK);
		
		Circle c21 = new Circle();
		c21.setCenterX(225);
		c21.setCenterY(250);
		c21.setRadius(10);
		c21.setFill(Color.BLACK);
		
		Circle c22 = new Circle();
		c22.setCenterX(275);
		c22.setCenterY(250);
		c22.setRadius(10);
		c22.setFill(Color.BLACK);
		
		Circle c23 = new Circle();
		c23.setCenterX(150);
		c23.setCenterY(200);
		c23.setRadius(10);
		c23.setFill(Color.BLACK);
		
		Circle c24 = new Circle();
		c24.setCenterX(200);
		c24.setCenterY(200);
		c24.setRadius(10);
		c24.setFill(Color.BLACK);
		
		Circle c25 = new Circle();
		c25.setCenterX(250);
		c25.setCenterY(200);
		c25.setRadius(10);
		c25.setFill(Color.BLACK);
		
		Circle c26 = new Circle();
		c26.setCenterX(175);
		c26.setCenterY(150);
		c26.setRadius(10);
		c26.setFill(Color.BLACK);
		
		Circle c27 = new Circle();
		c27.setCenterX(225);
		c27.setCenterY(150);
		c27.setRadius(10);
		c27.setFill(Color.BLACK);
		
		Circle c28 = new Circle();
		c28.setCenterX(200);
		c28.setCenterY(100);
		c28.setRadius(10);
		c28.setFill(Color.BLACK);
		
		a.getChildren().addAll(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15,
						c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28);
		
		Scene scene = new Scene(a, 400, 500);
		primaryStage.setTitle("my funny bean game");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
