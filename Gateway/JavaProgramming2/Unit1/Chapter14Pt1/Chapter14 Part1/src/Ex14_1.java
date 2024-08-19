import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setHgap(20);
		pane.setVgap(20);
		pane.setAlignment(Pos.CENTER);

		ImageView imgV1 = new ImageView("image/germany.gif");
		ImageView imgV2 = new ImageView("image/china.gif");
		ImageView imgV3 = new ImageView("image/uk.gif");
		ImageView imgV4 = new ImageView("image/us.gif");

		pane.add(imgV1, 0, 0);
		pane.add(imgV2, 1, 0);
		pane.add(imgV3, 0, 1);
		pane.add(imgV4, 1, 1);

		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("Ex 14.1 - Display Flags");
		primaryStage.setScene(scene);
		primaryStage.show();
		}

	public static void main(String[] args) {
		launch(args);

	}





}
