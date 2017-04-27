import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Question16_23 extends Application{
    int speed, numberOfImages;
    public String audioFile = "";
    String filePrefix;
    Button startAnimationButton = new Button("Start Animation");
    Label messageLabel, speedLabel, prefixLabel, imageNumberLabel, fileURLLabel;
    TextField speedField, prefixField, imageNumberField;
    TextField fileURLField = new TextField();

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage secondaryStage) throws Exception{
        VBox vBox = new VBox(5);
        messageLabel = new Label("Enter information for animation");
        speedLabel = new Label("Animation speed in milliseconds: ");
        prefixLabel = new Label("Image file prefix: ");
        imageNumberLabel = new Label("Number of images: ");
        fileURLLabel = new Label("Audio File URL: ");

        speedField = new TextField();
        prefixField = new TextField();
        imageNumberField = new TextField();
        fileURLField = new TextField();

        vBox.getChildren().addAll(startAnimationButton, messageLabel, speedLabel, speedField, prefixLabel, prefixField, imageNumberLabel, imageNumberField, fileURLLabel, fileURLField);
        Scene scene = new Scene(vBox, 500, 300);
        secondaryStage.setScene(scene);
        secondaryStage.show();
    }
}
