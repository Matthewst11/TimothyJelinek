import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex15_1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 52; i++) {
			list.add(i);
		}
		java.util.Collections.shuffle(list);

		HBox cards = new HBox(10);
		cards.setAlignment(Pos.CENTER);

		cards.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
		cards.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
		cards.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));
		cards.getChildren().add(new ImageView("image/card/" + list.get(3) + ".png"));

		Button btnRefresh = new Button("Refresh");

		btnRefresh.setOnAction(e -> {
			java.util.Collections.shuffle(list);
			cards.getChildren().clear();
			cards.getChildren().add(new ImageView("image/card/" + list.get(0) + ".png"));
			cards.getChildren().add(new ImageView("image/card/" + list.get(1) + ".png"));
			cards.getChildren().add(new ImageView("image/card/" + list.get(2) + ".png"));
			cards.getChildren().add(new ImageView("image/card/" + list.get(3) + ".png"));
		});

		pane.setCenter(cards);
		pane.setBottom(btnRefresh);
		BorderPane.setAlignment(btnRefresh, Pos.TOP_CENTER);

		Scene scene = new Scene(pane, 380, 180);
		primaryStage.setTitle("Ex 15.1 - Shuffle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}



}
