import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ex15_27 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Text text = new Text("Scrolling Text Yo");

		pane.getChildren().add(text);

		PathTransition pt = new PathTransition(Duration.millis(3000),
				new Line(-60, 300, 660, 300), text);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();

		text.setOnMousePressed(e -> pt.pause());
		text.setOnMouseReleased(e -> pt.play());

		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setTitle("Ex 15.27 - Scrolling Text");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}




}
