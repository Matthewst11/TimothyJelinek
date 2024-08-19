import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex14_3 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 52; i++) {
			list.add(i);
		}
		java.util.Collections.shuffle(list);

		HBox hb1 = new HBox(10);
		hb1.setAlignment(Pos.CENTER);

		hb1.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
		hb1.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
		hb1.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));

		Scene scene = new Scene(hb1, 400, 200);
		primaryStage.setTitle("Ex 14.3 - Display Cards");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}


}
