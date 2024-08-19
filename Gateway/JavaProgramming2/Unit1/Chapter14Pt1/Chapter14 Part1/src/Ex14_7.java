import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_7 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		double WIDTH = 300;
		double HEIGHT = 350;

		GridPane pane = new GridPane();

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				TextField tf = new TextField((int)(Math.random() * 2) + "");
				tf.setPrefColumnCount(1);
				tf.setAlignment(Pos.CENTER);
				pane.add(tf, j, i);

			}
		}

		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setTitle("Ex 14.7 - Display numbers");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}



}
