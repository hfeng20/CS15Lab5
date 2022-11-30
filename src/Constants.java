
/**
 * The constants class contains useful constants that will be used throughout
 * our program.
 */

public class Constants {
  // general constants to set up the GUI
  public static final double ARC_DIM = 25;
  public static final double APP_WIDTH = 300;
  public static final double APP_HEIGHT = 450;
  public static final double BUTTON_SPACING = 30;

  // all the constants to set up the board, the board is an ellipse
  public static final double BOARD_RAD_X = 75;
  public static final double BOARD_RAD_Y = 175;
  public static final double BOARD_Y = APP_HEIGHT / 2 - 20;

  // all the constants to create the design, the design is a rectangle with an arc
  public static final double DESIGN_WIDTH = 45;
  public static final double DESIGN_HEIGHT = BOARD_RAD_Y * 2;
  public static final double DESIGN_Y = 30;

  // all the constants to set up the stripe, the stripe is a rectangle
  public static final double STRIPE_WIDTH = 10;
  public static final double STRIPE_HEIGHT = BOARD_RAD_Y * 2;
  public static final double STRIPE_Y = 30;

  // movement constants
  public static final double DESIGN_OFFSET = DESIGN_WIDTH / 2;
  public static final double STRIPE_OFFSET = STRIPE_WIDTH / 2;
  public static final double DISTANCE_X = 10;
  public static final double START_X_OFFSET = APP_WIDTH / 2;
}