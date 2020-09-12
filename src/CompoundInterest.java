

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CompoundInterest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Compound Interest");
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.4));
        pane.setHgap(10);
        pane.setVgap(10);


        Text head = new Text("Compound Interest");
        head.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD,20));

        pane.add(head,  0,0,2,  1);



        pane.add(new Label("Start amount:"),0,01);
        final TextField amount = new TextField();
        pane.add(amount,1,1);


        pane.add(new Label("Interest:"),0,2);
        final TextField Interest = new TextField();
        pane.add(Interest,1,2);


        pane.add(new Label("Number of years:"),0,3);
       final TextField year = new TextField();
        pane.add(year,1,3);



        Button calculateTheMoneyButton = new Button("Calculate");
        pane.add(calculateTheMoneyButton,0,4);
        GridPane.setHalignment(calculateTheMoneyButton, HPos.LEFT);



        Label result = new Label();
        pane.add(result,0,5);

        calculateTheMoneyButton.setOnAction(e -> {
            if (!amount.getText().isEmpty() && !Interest.getText().isEmpty() && !year.getText().isEmpty()) {
                double price = Double.parseDouble(amount.getText());
                double profit = Double.parseDouble(Interest.getText()) / 100;
                double Years = Double.parseDouble(year.getText());
                double total = price * Math.pow((1 + profit), Years);
                int value = (int) Math.round(total);
                result.setText("In total that will be : " + value);

            }else
            if (amount.getText().isEmpty()|| Interest.getText().isEmpty()|| year.getText().isEmpty())
                result.setText("Please fill out all the \"Requirements\"!!!");
        });
        Scene scene = new Scene(pane,450,200);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}

