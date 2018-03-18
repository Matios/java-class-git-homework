package misc;

import models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Top level state container for the entire game.
 */
public class GameState {

    private PlayerModel player;
    private BallModel ball;
    private HoopModel hoop;
    private Shot shot = new Shot();
    private Ground ground = new Ground();

    private List<Renderable> renderables = new ArrayList<>();

    public GameState(PlayerModel player, BallModel ball, HoopModel hoop) {
        this.player = player;
        this.ball = ball;
        this.hoop = hoop;
        renderables.add(ground);
        renderables.add(shot);
        renderables.add(player);
        renderables.add(ball);
        renderables.add(hoop);
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public BallModel getBall() {
        return ball;
    }

    public HoopModel getHoop() {
        return hoop;
    }

    public Ground getGround() {
        return ground;
    }

    public Shot getShot() {
        return shot;
    }

    public List<Renderable> getRenderables() {
        return renderables;
    }

}
