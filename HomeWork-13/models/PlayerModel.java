package models;

import java.awt.*;

/**
 * State object for the player.  Contains player height, position information
 * and whether or not the player is holding the ball.
 */
public class PlayerModel extends Model {

    private BallModel heldBall = null;

    public PlayerModel(int x) {
        setX(x);
        setHeight(150);
    }

    public void render(Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        int playerOffsetFromGround = (int) Math.round(-getY());
        int y = canvasSize.height - groundHeight + playerOffsetFromGround - getHeight();
        graphics.setColor(Color.BLUE);
        graphics.drawRect((int) Math.round(getX()), y, 30, getHeight());
    }

    public boolean isHolding(BallModel ball) {
        return heldBall != null && heldBall.equals(ball);
    }

    public void hold(BallModel ball) {
        heldBall = ball;
    }

    public void letGoOfBall() {
        heldBall = null;
    }
}
