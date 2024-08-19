import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_8 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane pane = new GridPane();

		int k = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 9; j++) {
				pane.add(new ImageView("image/card/" + ++k + ".png"), j, i);

			}
		}

		Scene scene = new Scene(pane, 650, 650);
		primaryStage.setTitle("Ex 14.8 - Display cards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}



}
