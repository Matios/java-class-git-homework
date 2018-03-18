package misc;

import java.awt.*;

/**
 * State object representing the ground.
 */
public class Ground implements Renderable {
    private int height = 200;

    public int getHeight() {
        return height;
    }

    public void render(Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        graphics.setColor(Color.BLACK);
        graphics.setStroke(new BasicStroke(3));
        int groundY = canvasSize.height - height;
        graphics.drawRect(0, groundY, canvasSize.width, canvasSize.height);
    }
}
