package CodingQuestion1.SampleSolution;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root = new VBox();
        Scene scene = new Scene(root, 200, 200);

        Label out = new Label("Empty Label");
        TextField textField = new TextField();
        Button button = new Button("Update Label");
        button.setOnAction(e->{out.setText(textField.getText());});

        root.getChildren().addAll(out, textField, button);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
