package mr223_assign3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application {
    private Rectangle rectangle;
    private Circle circle;
    private Line line;
    Pane root = new Pane();
    ComboBox<String> shapes = new ComboBox<>();
    ColorPicker colorPicker = new ColorPicker();
    ComboBox<Integer> sizes = new ComboBox<>();
    private double x;
    private double y;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root, 1000, 600);
        //Config shape && colorpicker
        shapes.relocate(6, 6);
        shapes.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
        colorPicker.relocate(200, 5);

        sizes.relocate(125, 5);
        for (int i = 1; i <= 40; i++) {
            sizes.getItems().add(i);
        }

        root.setOnMousePressed(this::MousePressed);
        root.setOnMouseDragged(this::MouseDragged);

        root.getChildren().addAll(shapes, sizes, colorPicker);
        scene.setFill(Color.WHITE);
        primaryStage.setTitle("Tiny Painter");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    void MousePressed(javafx.scene.input.MouseEvent mouseEvent) {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        if (shapes.getSelectionModel().getSelectedIndex() == 0) {
            int lwidth = sizes.getSelectionModel().getSelectedItem();
            line = new Line();
            line.setStrokeWidth(lwidth);
            line.setStroke(colorPicker.getValue());
            line.relocate(x, y);
            root.getChildren().addAll(line);
        }
        if (shapes.getSelectionModel().getSelectedIndex() == 1) {
            int dotsize = sizes.getSelectionModel().getSelectedItem();
            rectangle = new Rectangle(dotsize, dotsize);
            rectangle.setStrokeWidth(dotsize);
            rectangle.setFill(colorPicker.getValue());
            rectangle.relocate(x, y);
            root.getChildren().addAll(rectangle);
        }
        if (shapes.getSelectionModel().getSelectedIndex() == 2) {
            int rec = sizes.getSelectionModel().getSelectedItem();
            rectangle = new Rectangle();
            rectangle.setStrokeWidth(rec);
            rectangle.setFill(colorPicker.getValue());
            rectangle.relocate(x, y);
            root.getChildren().add(rectangle);
        }
        if (shapes.getSelectionModel().getSelectedIndex() == 3) {
            circle = new Circle();
            circle.relocate(x, y);
            circle.setFill(colorPicker.getValue());
            root.getChildren().addAll(circle);
        }
    }

    void MouseDragged(javafx.scene.input.MouseEvent event) {
        if (shapes.getSelectionModel().getSelectedIndex() == 0) {
            line.setEndX(event.getX() - x);
            line.setEndY(event.getY() - y);
        } else {
            if (shapes.getSelectionModel().getSelectedIndex() == 2) {
                rectangle.setHeight(event.getX() - x);
                rectangle.setWidth(event.getY() - y);
                rectangle.setWidth(event.getX() - rectangle.getTranslateX());
                rectangle.setHeight(event.getY() - rectangle.getTranslateY());
                rectangle.setStroke(colorPicker.getValue());
            } else {
                if (shapes.getSelectionModel().getSelectedIndex() == 3) {
                    circle.setRadius(event.getX() - x);
                }

            }
        }
    }
}

