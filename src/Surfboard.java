
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

/**
 * A class containing the graphical elements for the Surfboard and methods to
 * move it and access its location.
 */
public class Surfboard {

  private Ellipse board;
  private Rectangle design;
  private Rectangle stripe;

  /*
   * The constructor for the Surfboard class. Creates all graphical components and
   * sets
   * up original location.
   */
  public Surfboard(Pane root) {
    this.board = new Ellipse(0, Constants.BOARD_Y, Constants.BOARD_RAD_X, Constants.BOARD_RAD_Y);
    this.design = new Rectangle(0, Constants.DESIGN_Y, Constants.DESIGN_WIDTH, Constants.DESIGN_HEIGHT);

    root.getChildren().addAll(this.board, this.design, this.stripe);
    this.setUpSurfboard();
  }

  private void setUpSurfboard() {
    this.design.setArcWidth(Constants.ARC_DIM);
    this.design.setArcHeight(Constants.ARC_DIM);
    this.setXLoc(Constants.START_X_OFFSET);
  }

  /*
   * A method to method the surfboard left and right.
   */
  public void setXLoc(double x) {
    this.board.setCenterX(x);
    this.design.setX(x - Constants.DESIGN_OFFSET);
    this.stripe.setX(x - Constants.STRIPE_OFFSET);
  }

  /*
   * A method to get the current location of the surfboard.
   */
  public double getXLoc() {
    return this.board.getCenterX();
  }

  private void makePretty() {
    this.board.setFill(Color.LIGHTBLUE);
    this.design.setFill(Color.LIGHTCYAN);
    this.stripe.setFill(Color.LIGHTCORAL);
  }
}