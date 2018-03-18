package misc;

import java.awt.*;

/**
 * State object for the upcoming shot.
 */
public class Shot implements Renderable {
    private int angle = 45;
    private int power = 10;

    @Override
    public void render(Graphics2D graphics, Dimension canvasSize, int groundHeight) {
        graphics.setColor(Color.BLACK);
        graphics.setStroke(new BasicStroke(3));
        graphics.setFont(graphics.getFont().deriveFont(Font.BOLD).deriveFont(36.5f));
        int y = canvasSize.height - groundHeight/2;
        graphics.drawString("Power: " + power, 300, y);
        graphics.drawString("Angle: " + angle, 700, y);
    }


    public void incrementPower() {
        power = power + 1;
    }

    public void decrementPower() {
        power = power - 1;
    }


    public void incrementAngle() {
        angle = angle + 1;
    }

    public void decrementAngle() {
        angle = angle - 1;
    }

    public int getAngle() {
        return angle;
    }

    public int getPower() {
        return power;
    }
}
