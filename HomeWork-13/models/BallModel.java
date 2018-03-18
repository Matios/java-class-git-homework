package models;

import java.awt.*;

/**
 * Contains all the state for the ball in the game.  This includes position
 * and current velocity.
 */
public class BallModel extends Model {

    public BallModel() {
        setWidth(30);
    }

    public void render(Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        graphics.setColor(Color.orange);
        double ballOffsetFromGround = -getY();
        double y = canvasSize.height - groundHeight + ballOffsetFromGround - getDiameter();
        graphics.fillOval((int) Math.round(getX()), (int) Math.round(y), getDiameter(), getDiameter());
    }

    public int getDiameter() {
        return getWidth();
    }
}
