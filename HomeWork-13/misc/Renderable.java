package misc;

import java.awt.*;

public interface Renderable {
    void render(Graphics2D graphics, Dimension canvasSize, int groundHeight);
}
