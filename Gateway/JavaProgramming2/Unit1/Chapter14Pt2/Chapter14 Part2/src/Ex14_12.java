import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex14_12 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// BorderPane pane = new BorderPane();
		double panelHeight = 150;
		double height = 300;

		Text t1 = new Text(10, panelHeight - height * 0.2 - 10, "Project - 20%");
		Rectangle r1 = new Rectangle(10, panelHeight - height * 0.2, 100, height * 0.2);
		r1.setFill(Color.RED);

		Text t2 = new Text(120, panelHeight - height * 0.1 - 10, "Quiz - 10%");
		Rectangle r2 = new Rectangle(120, panelHeight - height * 0.1, 100, height * 0.1);
		r2.setFill(Color.BLUE);

		Text t3 = new Text(230, panelHeight - height * 0.3 - 10, "Mid Term - 30%");
		Rectangle r3 = new Rectangle(230, panelHeight - height * 0.3, 100, height * 0.3);
		r3.setFill(Color.GREEN);

		Text t4 = new Text(340, panelHeight - height * 0.4 - 10, "Final Exam - 40%");
		Rectangle r4 = new Rectangle(340, panelHeight - height * 0.4, 100, height * 0.4);
		r4.setFill(Color.ORANGE);


		Group group = new Group();
		group.getChildren().addAll(r1, r2, t1, t2, r3, t3, r4, t4);


		Scene scene = new Scene(new BorderPane(group), 500, panelHeight );
		primaryStage.setTitle("Ex 14.12 - Display graph");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}



}
