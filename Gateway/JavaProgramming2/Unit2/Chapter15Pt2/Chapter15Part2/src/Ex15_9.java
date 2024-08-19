import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex15_9 extends Application {
	private double x = 250;
	private double y = 250;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		pane.setFocusTraversable(true);

		pane.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.W){
				pane.getChildren().add(new Line(x, y, x, y - 10));
				y -= 10;
			}
			else if (e.getCode() == KeyCode.S){
				pane.getChildren().add(new Line(x, y, x, y + 10));
				y += 10;
			}
			else if (e.getCode() == KeyCode.A){
				pane.getChildren().add(new Line(x, y, x - 10, y));
				x -= 10;
			}
			else if (e.getCode() == KeyCode.D){
				pane.getChildren().add(new Line(x, y, x + 10, y));
				x += 10;
			}
		});

		Scene scene = new Scene(pane, x * 2, y * 2);
		primaryStage.setTitle("Ex 15.9 - etch-a-sketch");
		primaryStage.setScene(scene);
		primaryStage.show();

		pane.requestFocus();
	}

	public static void main(String[] args) {
		launch(args);

	}



}
