import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex15_4 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();

		FlowPane fpane = new FlowPane();
		fpane.setHgap(8);
		fpane.setAlignment(Pos.CENTER);
		TextField tfNum1 = new TextField();
		TextField tfNum2 = new TextField();
		TextField tfAnswer = new TextField();
		tfNum1.setPrefColumnCount(3);
		tfNum2.setPrefColumnCount(3);
		tfNum2.setPrefColumnCount(6);

		fpane.getChildren().addAll(
				new Label("Number 1: "), tfNum1,
				new Label("Number 2: "), tfNum2,
				new Label("Result: "), tfAnswer
				);

		HBox buttons = new HBox(7);
		Button btnAdd = new Button("Add");
		Button btnSubtract = new Button("Subtract");
		Button btnMultiply = new Button("Multiply");
		Button btnDivide = new Button("Divide");
		buttons.getChildren().addAll(btnAdd, btnSubtract, btnMultiply, btnDivide);
		buttons.setAlignment(Pos.CENTER);


		pane.setCenter(fpane);
		pane.setBottom(buttons);
		BorderPane.setAlignment(buttons, Pos.TOP_CENTER);

		Scene scene = new Scene(pane, 500, 100);
		primaryStage.setTitle("Ex 15.4 - Calculate");
		primaryStage.setScene(scene);
		primaryStage.show();

		btnAdd.setOnAction(e -> {
			tfAnswer.setText(Double.parseDouble(tfNum1.getText()) +
					Double.parseDouble(tfNum2.getText()) + "");
		});
		btnSubtract.setOnAction(e -> {
			tfAnswer.setText(Double.parseDouble(tfNum1.getText()) -
					Double.parseDouble(tfNum2.getText()) + "");
		});
		btnMultiply.setOnAction(e -> {
			tfAnswer.setText(Double.parseDouble(tfNum1.getText()) *
					Double.parseDouble(tfNum2.getText()) + "");
		});
		btnDivide.setOnAction(e -> {
			tfAnswer.setText(Double.parseDouble(tfNum1.getText()) /
					Double.parseDouble(tfNum2.getText()) + "");
			});
	}

	public static void main(String[] args) {
		launch(args);

	}

}
