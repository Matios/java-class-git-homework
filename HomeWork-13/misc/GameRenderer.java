package misc;

import java.awt.*;

/**
 * Top level renderer for the whole game.  Also accepts state updates and handles
 * repainting the screen.
 */
public class GameRenderer extends Component {

    private GameState state;

    public GameRenderer(GameState state) {
        this.state = state;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Dimension size = getSize();
        Graphics2D graphics2D = (Graphics2D) g;
        int groundHeight = state.getGround().getHeight();
        for (Renderable renderable : state.getRenderables()) {
            renderable.render(graphics2D, size, groundHeight);
        }
    }

    public void updateState(GameState state) {
        this.state = state;
        this.repaint();
    }
}
