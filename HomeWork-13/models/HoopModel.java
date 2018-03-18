package models;

import java.awt.*;

/**
 * State object for the basketball hoop.  Contains position information,
 * pole height and the hoop diameter.
 */
public class HoopModel extends Model {

    int strokeWidth = 8;

    private int hoopDiameter = 50;

    public HoopModel(int height) {
        setHeight(height);
    }

    @Override
    public void render(Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        graphics.setColor(Color.BLACK);
        graphics.setStroke(new BasicStroke(strokeWidth));
        int offsetFromGround = (int)Math.round(-getY());
        int y = canvasSize.height - groundHeight + offsetFromGround;
        int x = canvasSize.width - strokeWidth;
        graphics.drawLine(x, y, x, y - getHeight());
        int basketY = y - getHeight() + 60;
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(x - strokeWidth, basketY, x - getHoopDiameter(), basketY);
    }

    public int getHoopDiameter() {
        return hoopDiameter;
    }
}
