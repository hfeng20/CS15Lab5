import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Top level class for the program.
 */
public class App extends Application {
  public static void main(String[] args) {
    launch();
  }

  /*
   * Starts the program and creates the PaneOrganizer.
   */
  @Override
  public void start(Stage stage) {
    PaneOrganizer organizer = new PaneOrganizer();
    Scene scene = new Scene(organizer.getRoot(), Constants.APP_WIDTH, Constants.APP_HEIGHT);
    stage.setScene(scene);
    stage.setTitle("Moving Surfboard!");
    stage.show();
  }
}
