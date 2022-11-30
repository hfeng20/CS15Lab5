
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * The Surfboard Mover class creates a surfboard and other graphical elements
 * in the program. It has methods to move the surfboard around.
 */
public class SurfboardMover {

  private Surfboard surfboard;

  /*
   * The constructor for the SurfboardMover class creates a new Surfboard and sets
   * up the buttons.
   */
  public SurfboardMover(Pane surfboardPane, HBox buttonPane) {
    this.surfboard = new Surfboard(surfboardPane);
    this.setUpButtons(buttonPane);
  }

  /*
   * Sets up the move left and right buttons and assigns actions to them.
   */
  private void setUpButtons(HBox buttonPane) {
    Button b1 = new Button("Move Left!");
    Button b2 = new Button("Move Right!");
    b1.setOnAction((ActionEvent e) -> this.moveSurfboard(false));
    b2.setOnAction((ActionEvent e) -> this.moveSurfboard(true));
    buttonPane.getChildren().addAll(b1, b2);
    buttonPane.setSpacing(Constants.BUTTON_SPACING);
  }

  /*
   * Calls appropriate methods to move the surfboard left or right.
   */
  private void moveSurfboard(boolean isRight) {
    double distance = Constants.DISTANCE_X;
    if (isRight) {
      distance = distance * -1;
    }
    this.surfboard.setXLoc(this.surfboard.getXLoc() + distance);
  }
}