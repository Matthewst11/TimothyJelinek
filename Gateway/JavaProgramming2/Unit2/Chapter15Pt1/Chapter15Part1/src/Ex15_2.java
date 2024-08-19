import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex15_2 extends Application {
	private double angle = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rectangle = new Rectangle(0, 0, 40, 80);
		rectangle.setFill(Color.WHITE);
		rectangle.setStroke(Color.BLACK);

		BorderPane pane = new BorderPane();

		Button btnRotate = new Button("Rotate");

		btnRotate.setOnAction(e -> {
			angle += 15;
			rectangle.setRotate(angle);
		});

		pane.setCenter(rectangle);
		pane.setBottom(btnRotate);
		BorderPane.setAlignment(btnRotate, Pos.TOP_CENTER);

		Scene scene = new Scene(pane, 380, 180);
		primaryStage.setTitle("Ex 15.2 - Rotate");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}


}
