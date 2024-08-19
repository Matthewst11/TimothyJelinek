import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ex15_29 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		CarPane car = new CarPane();

		Scene scene = new Scene(car, 400, 100);
		primaryStage.setTitle("Ex 15.29 - Car Racing");
		primaryStage.setScene(scene);
		primaryStage.show();

		car.requestFocus();
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(50), e -> car.move()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();

		car.setOnMousePressed(e -> animation.pause());
		car.setOnMouseReleased(e -> animation.play());

		car.setOnKeyPressed(e -> {
		      if (e.getCode() == KeyCode.UP) {
		        animation.setRate(animation.getRate() + 1);
		      }
		      else if (e.getCode() == KeyCode.DOWN) {
		        animation.setRate(animation.getRate() - 1);
		      }
		    });

	}

	public static void main(String[] args) {
		launch(args);

	}
}

class CarPane extends Pane {
	private double w = 400;
	private double h = 100;
	private double baseX = 0;
	private double baseY = h;
	private Rectangle body = new Rectangle(baseX, baseY - 20, 50, 10);
	private Circle wheel1 = new Circle(baseX + 15, baseY - 5, 5);
	private Circle wheel2 = new Circle(baseX + 35, baseY - 5, 5);
	private Polygon carTop = new Polygon(baseX + 10, baseY - 20, baseX + 20, baseY - 30, baseX + 30,
			baseY - 30, baseX + 40, baseY - 20);

	public CarPane() {
		body.setFill(Color.GREEN);
		carTop.setFill(Color.RED);
		this.getChildren().addAll(body, wheel1, wheel2, carTop);
	}

	public void move() {
		if (baseX > w) {
			baseX = -50;
		}
		else {
			baseX += 1;
		}
		setValues();
	}

	private void setValues() {
		wheel1.setCenterX(baseX + 15);
		wheel1.setCenterY(baseY - 5);
		wheel2.setCenterX(baseX + 35);
		wheel2.setCenterY(baseY - 5);
		body.setX(baseX);
		body.setY(baseY - 20);
		carTop.getPoints().clear();
		carTop.getPoints().addAll(baseX + 10, baseY - 20, baseX + 20, baseY - 30,
				baseX + 30, baseY - 30, baseX + 40, baseY - 20);
	}

}
