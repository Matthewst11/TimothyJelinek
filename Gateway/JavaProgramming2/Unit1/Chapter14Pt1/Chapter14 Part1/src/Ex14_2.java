import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image imgX = new Image("image/x.gif");
		Image imgO = new Image("image/o.gif");

		GridPane pane = new GridPane();
		pane.setHgap(20);
		pane.setVgap(20);
		pane.setAlignment(Pos.CENTER);

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int status = (int)(Math.random() * 3);
				if (status == 0) {
					pane.add(new ImageView(imgX), j, i);
				}
				else if (status == 1) {
					pane.add(new ImageView(imgO), j, i);
				}
			}
		}

		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Ex 14.2 - Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}



}
