package tp;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application {
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		primaryStage.setTitle("Ma première fenêtre");
		primaryStage.setScene(scene);
		Rectangle r1= new Rectangle(150, 50, 100, 150);
		r1.setFill(Color.RED);
		root.getChildren().add(r1);
		
		Circle c1= new Circle(100, 100 , 50);
		c1.setFill(Color.BLACK);
		root.getChildren().add(c1);
		
		Line l1= new Line(50, 50, 100, 150);
		l1.setFill(Color.BLUE);
		root.getChildren().add(l1);
		
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
