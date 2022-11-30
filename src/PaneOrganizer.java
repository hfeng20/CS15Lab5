
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * Top level class for storing graphical components. Creates a Surfboard Mover.
 */
public class PaneOrganizer {

  private BorderPane root;

  public PaneOrganizer() {
    this.root = new BorderPane();
    Pane surfboardPane = new Pane();
    this.root.setCenter(surfboardPane);
    HBox buttonPane = new HBox();
    buttonPane.setAlignment(Pos.CENTER);
    this.root.setBottom(buttonPane);
    new SurfboardMover(surfboardPane, buttonPane);
  }

  public Pane getRoot() {
    return this.root;
  }
}