import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex15_5 extends Application {
	private TextField tfInvestAmt = new TextField();
	private TextField tfNumOfYears = new TextField();
	private TextField tfInterestRate = new TextField();
	private TextField tfFutureValue = new TextField();
	private Button btnCalc = new Button("Calculate");

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gpane = new GridPane();
		gpane.setHgap(5);
		gpane.setVgap(5);
		gpane.add(new Label("Investment Amount:"), 0, 0);
		gpane.add(tfInvestAmt, 1, 0);
		gpane.add(new Label("Number of Years: "), 0, 1);
		gpane.add(tfNumOfYears, 1, 1);
		gpane.add(new Label("Interest Rate:"), 0, 2);
		gpane.add(tfInterestRate, 1, 2);
		gpane.add(new Label("Future Value:"), 0, 3);
		gpane.add(tfFutureValue, 1, 3);
		gpane.add(btnCalc, 1, 4);

		gpane.setAlignment(Pos.CENTER);
		tfInvestAmt.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setEditable(false);
		gpane.setHalignment(btnCalc, HPos.RIGHT);

		btnCalc.setOnAction(e -> calcFutureValue());

		Scene scene = new Scene(gpane, 400, 250);
		primaryStage.setTitle("Ex 15.5 - Interest Calculate");
		primaryStage.setScene(scene);
		primaryStage.show();




	}
	private void calcFutureValue() {

		double annualInterestRate = Double.parseDouble(tfInterestRate.getText());
		int numberOfYears = Integer.parseInt(tfNumOfYears.getText());
		double investmentAmount = Double.parseDouble(tfInvestAmt.getText());

		double monthlyInterestRate = annualInterestRate / 1200;
		double futureValue = investmentAmount *
			Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

		tfFutureValue.setText(String.format("$%.2f", futureValue));
}

	public static void main(String[] args) {
		launch(args);

	}



}
