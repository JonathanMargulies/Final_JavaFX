import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Question16_22 extends Application {
    Button playButton = new Button("Play");
    Button loopButton = new Button("Loop");
    Button stopButton = new Button("Stop");
    static final String PATH = "http://www.cs.armstrong.edu/liang/common/audio/anthem/anthem2.mp3";

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));

        Media media = new Media(PATH);
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        playButton.setOnAction(e ->{
            mediaPlayer.play();
        });

        loopButton.setOnAction(e ->{
            mediaPlayer.setOnEndOfMedia(new Runnable(){
                public void run() {
                    mediaPlayer.seek(Duration.ZERO);
                }
            });
        });

        stopButton.setOnAction(e ->{
            mediaPlayer.stop();
        });


        hBox.getChildren().addAll(playButton, loopButton, stopButton);
        Scene scene = new Scene(hBox, 165, 45);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
