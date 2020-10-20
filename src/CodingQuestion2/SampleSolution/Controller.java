package CodingQuestion2.SampleSolution;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private AnchorPane root;

    private boolean isGreen = true;

    public void changeColor()
    {
        if (isGreen)
            root.setStyle("-fx-background-color: firebrick");
        else
            root.setStyle("-fx-background-color: green");

        isGreen = !isGreen;
    }
}
