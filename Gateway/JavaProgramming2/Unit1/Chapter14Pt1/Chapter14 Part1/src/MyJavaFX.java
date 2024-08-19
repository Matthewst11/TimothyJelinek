import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btOk = new Button("Ok");

		// Four lines below re in every app
		Scene scene = new Scene(btOk, 200, 250);
		primaryStage.setTitle("Big 'ol Ok Button");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
