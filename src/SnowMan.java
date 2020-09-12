

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class SnowMan extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SnowMan");

        // creating 3 circles
        Circle head = new Circle (320, 340, 50,Color.WHITE);

        Circle belly = new Circle (320, 270, 30,Color.WHITE);

        Circle lowerBody = new Circle (320, 225, 20,Color.WHITE);


        // creating a sun which will be displayed in the top right corner.
        Circle sunInTheSky = new Circle(520, 80, 60);
        sunInTheSky.setFill(Color.YELLOW);


// creating buttons
        Circle buttonTop = new Circle(320, 285, 4,Color.GREEN);

        Circle buttonMiddle = new Circle(320, 270, 4,Color.GREEN);

        Circle buttonBelow = new Circle(320, 255, 4,Color.GREEN);


//creating eyes
        Circle eye1 = new Circle(312, 220, 3,Color.BLUE);

        Circle eye2 = new Circle(328, 220, 3,Color.BLUE);
// creating mouth
        Line lips = new Line(310, 230, 330, 230);
         lips.setStroke(Color.BLUE);




// creating a hat for snow man
        Rectangle begin = new Rectangle(300,152,40,50);
        begin.setFill(Color.RED);
        begin.setStroke(Color.BLACK);

        Rectangle middle = new Rectangle(280,202,60,5);
        middle.setFill(Color.RED);
        middle.setStroke(Color.BLACK);
        middle.setTranslateX(10);



        //floor
        Rectangle ground = new Rectangle(0, 380, 640, 100);

        ground.setFill(Color.WHITE);

        // rest of the jobs for

        Group root = new Group(begin,middle);
        root.getChildren().addAll(head, belly, lowerBody, buttonTop, buttonMiddle, buttonBelow, eye1, eye2, lips,sunInTheSky, ground);

        Scene scene = new Scene(root, 640, 480);

        scene.setFill(Color.DEEPSKYBLUE);

        primaryStage.setScene(scene);

        primaryStage.show();



    }
}
