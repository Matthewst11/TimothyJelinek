import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ex15_3 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BallPane ball = new BallPane();

		BorderPane pane = new BorderPane();

		HBox buttons = new HBox(7);
		Button btnLeft = new Button("Left");
		Button btnRight = new Button("Right");
		Button btnUp = new Button("Up");
		Button btnDown = new Button("Down");
		buttons.getChildren().addAll(btnLeft, btnRight, btnUp, btnDown);
		buttons.setAlignment(Pos.CENTER);


		pane.setCenter(ball);
		pane.setBottom(buttons);
		BorderPane.setAlignment(buttons, Pos.TOP_CENTER);

		Scene scene = new Scene(pane, 350, 180);
		primaryStage.setTitle("Ex 15.3 - Move Circle");
		primaryStage.setScene(scene);
		primaryStage.show();

		btnLeft.setOnAction(e -> {ball.left();});
		btnRight.setOnAction(e -> {ball.right();});
		btnUp.setOnAction(e -> {ball.up();});
		btnDown.setOnAction(e -> {ball.down();});

	}

	public static void main(String[] args) {
		launch(args);

	}

	class BallPane extends Pane {
		Circle circle = new Circle(125, 90, 15);

		BallPane() {
			getChildren().add(circle);
			circle.setFill(Color.RED);
			circle.setStroke(Color.BLACK);
		}

		public void left() {
			circle.setCenterX(circle.getCenterX() > 16 ? circle.getCenterX() - 5 : 15);
		}

		public void right() {
			circle.setCenterX(circle.getCenterX() < getWidth() - 16 ?
					circle.getCenterX() + 5 : getWidth() - 15);
		}

		public void up() {
			circle.setCenterY(circle.getCenterY() > 16 ? circle.getCenterY() - 5 : 15);
		}

		public void down() {
			circle.setCenterY(circle.getCenterY() < getHeight() - 16 ?
					circle.getCenterY() + 5 : getHeight() - 15);
		}
	}



}
