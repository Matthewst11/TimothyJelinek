import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex15_18 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Rectangle rectangle = new Rectangle(225, 220, 50, 60);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.BLUE);

		rectangle.setOnMouseDragged(e -> {
			if (rectangle.contains(e.getX(), e.getY())){
				rectangle.setX(e.getX() - 25);
				rectangle.setY(e.getY() - 30);
			}
		});

		pane.getChildren().add(rectangle);

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Ex 15.18 - Move Rectangle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}



}
