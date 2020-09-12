

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Yahtzee extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Yahtzee");
        primaryStage.setScene(new Scene(new YahtzeeFrame(), 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    class YahtzeeFrame extends Group implements EventHandler<ActionEvent> {
        private Text msgText;

        private Die[] dice = new Die[5];

        private int rollsLeft = 3;

        public YahtzeeFrame() {
            VBox rootPane = new VBox(20);
            getChildren().add(rootPane);

            Text title = new Text("Yahtzee");
            title.setFont(Font.font("Verdana", 40));
            rootPane.getChildren().add(title);

            GridPane diceGrid = new GridPane();
            rootPane.setAlignment(Pos.CENTER_LEFT);
            rootPane.getChildren().add(diceGrid);

            for (int i = 1; i <= 5; i++) {
                dice[i - 1] = new Die(i, new CheckBox());
                GridPane.setHalignment(dice[i - 1].getCheckBox(), HPos.CENTER);
                diceGrid.add(dice[i - 1].getView(), i -1, 0);
                diceGrid.add(dice[i - 1].getCheckBox(), i -1, 1);
            }

            HBox bottomBox = new HBox();
            rootPane.getChildren().add(bottomBox);

            Button rollButton = new Button("Roll the dice!");
            rollButton.setOnAction(this);
            bottomBox.getChildren().add(rollButton);

            msgText = new Text();
            bottomBox.getChildren().add(msgText);
            setMsgText();
        }

        private void setMsgText() {
            msgText.setText("You have " + rollsLeft + " roll(s) left.");
        }

        @Override
        public void handle(ActionEvent arg0) {
            if (rollsLeft != 0) {
                for (int i = 0; i < 5; i++) {
                    if (!dice[i].isOnHold()) {
                        dice[i].roll();
                    }
                }
                rollsLeft--;
                setMsgText();
            }
            if (rollsLeft == 0) {
                gameOver();
            }
        }

        private void gameOver() {
            List<Integer> diceValues = Arrays.asList(dice).stream()
                    .map(die -> die.getValue()).collect(Collectors.toList());

            if (isYahtzee(diceValues)) {
                msgText.setText("Yahtzee");
            } else if (isFourOfAKind(diceValues)) {
                msgText.setText("Four of a kind");
            } else if(isFullHouse(diceValues)) {
                msgText.setText("Full house");
            } else if (isThreeOfAKind(diceValues)) {
                msgText.setText("Three of a kind");
            } else if (isLargeStraight(diceValues)) {
                msgText.setText("Large straight");
            } else if (isSmallStraight(diceValues)) {
                msgText.setText("Small straight");
            } else if (isPair(diceValues)) {
                msgText.setText("Pair");
            }

        }

        private boolean isYahtzee(List<Integer> diceValues) {
            return diceValues.stream().distinct().count() == 1;
        }

        private boolean isFourOfAKind(List<Integer> diceValues) {
            List<Integer> copyValues = diceValues.stream().sorted().collect(Collectors.toList());
            if (copyValues.get(0) == copyValues.get(1)) {
                copyValues.remove(copyValues.size() -  1); // remove last one
            } else { // remove first otherwise
                copyValues.remove(0);
            }
            return copyValues.stream().distinct().count() == 1; // one should be left after removing duplicates
        }

        private boolean isFullHouse(List<Integer> diceValues) {
            return diceValues.stream().distinct().count() == 2;
        }

        private boolean isThreeOfAKind(List<Integer> diceValues) {
            List<Integer> copyValues = diceValues.stream().sorted().collect(Collectors.toList());
            if (copyValues.get(0) == copyValues.get(1)
                    && copyValues.get(1) == copyValues.get(2)) {
                copyValues.remove(copyValues.size() -  1); // remove 2 last
                copyValues.remove(copyValues.size() -  1);

            } else if (copyValues.get(4) == copyValues.get(3)
                    && copyValues.get(3) == copyValues.get(2)) {
                copyValues.remove(0);// remove 2 first
                copyValues.remove(0);
            } else {
                copyValues.remove(4); //last
                copyValues.remove(0);//first
            }
            return copyValues.stream().distinct().count() == 1;
        }

        private boolean isLargeStraight(List<Integer> diceValues) {
            boolean isLargeStraight = true;
            Integer current = diceValues.get(0);

            for (int value: diceValues) {
                isLargeStraight &= value == current;
                current++;
            }
            return isLargeStraight;
        }

        private boolean isSmallStraight(List<Integer> diceValues) {
            boolean isLargeStraight = true;
            Integer current = diceValues.get(0);

            for (int i = 0; i < diceValues.size() - 1; i++) { // 4 first values
                isLargeStraight &= diceValues.get(i) == current;
                current++;
            }

            if (!isLargeStraight) {
                isLargeStraight = true; //reset
                current = diceValues.get(1);

                for (int i = 1; i < diceValues.size(); i++) { //4 last values
                    isLargeStraight &= diceValues.get(i) == current;
                    current++;
                }
            }
            return isLargeStraight;
        }

        private boolean isPair(List<Integer> diceValues) {
            long count = diceValues.stream().distinct().count();
            return count == 4 || count == 3;
        }
    }


    public static class Die {

        private int value;

        private ImageView view;

        private CheckBox checkBox;

        public Die(int value, CheckBox checkBox) {
            this.value = value;
            this.checkBox = checkBox;
            this.checkBox.setAlignment(Pos.CENTER);
            view = new ImageView(dice[value - 1]);
            view.setFitHeight(100);
            view.setFitWidth(100);
        }

        public int getValue() {
            return value;
        }

        public ImageView getView() {
            return view;
        }

        public boolean isOnHold() {
            return checkBox.isSelected();
        }

        public CheckBox getCheckBox() {
            return checkBox;
        }

        private static final Random RAND = new Random();

        private static final Image[] dice = new Image[6];

        static {
            for (int i = 1; i <= 6; i++) {
                InputStream input = Die.class.getClassLoader()
                        .getResourceAsStream("die" + i + ".png");
                dice[i - 1] = new Image(input);
            }
        }

        public void roll() {
            int rand = RAND.nextInt(7); // 0 - 6
            value = rand == 0? 1: rand;
            view.setImage(dice[value - 1]);
        }
    }

}
