import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ex14_17  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		Line line1 = new Line(150, 20, 300, 20);
		Line line2 = new Line(150, 20, 150, 400);
		Line line3 = new Line(300, 20, 300, 270);
		Circle head = new Circle(300, 70, 20, Color.WHITE);
		head.setStroke(Color.BLACK);
		Line line4 = new Line(300, 270, 250, 320);
		Line line5 = new Line(300, 270, 350, 320);
		Line leftArm = new Line(300, 120, 350, 170);
		Line line7 = new Line(300, 120, 250, 170);
		Arc arc = new Arc(150, 420, 60, 30, 0, 180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);

		pane.getChildren().addAll(line1, line2, line3, head, line4, line5, leftArm, line7, arc);

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Ex 14.17 - Hangman");
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public static void main(String[] args) {
	launch(args);

	}

}
