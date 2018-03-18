package misc;
import java.util.*;
import engines.EngineInterface;
import engines.CollisionEngine;
import engines.GravityEngine;
import engines.MovementEngine;
import engines.WindEngine;
import models.BallModel;
import engines.Engine;

import models.PlayerModel;


/**
 * Top level engine that drives the changes in the game.
 */
public class GameEngine {
    public GameEngine(){
        engines.add(new GravityEngine());
        engines.add(new MovementEngine());
        engines.add(new CollisionEngine());
        engines.add(new WindEngine());

    }
    public List<Engine> engines =new ArrayList<Engine>();
   // private GravityEngine gravityEngine = new GravityEngine();
    //private MovementEngine movementEngine = new MovementEngine();
    //private CollisionEngine collisionEngine = new CollisionEngine();
    //private WindEngine windEngine = new WindEngine();

    public void updateState(GameState state, String input) {
        updateFromUserInput(state, input);

        for (Engine a : engines){
            a.updateState(state);
        }
      //  gravityEngine.updateState(state);
       // windEngine.updateState(state);
        //movementEngine.updateState(state);
        //collisionEngine.updateState(state);
    }

    private void updateFromUserInput(GameState state, String input) {
        if (input != null) {
            switch (input) {
                case "ARROW_UP":
                    state.getShot().incrementAngle();
                    break;
                case "ARROW_DOWN":
                    state.getShot().decrementAngle();
                    break;
                case "ARROW_LEFT":
                    state.getShot().decrementPower();
                    break;
                case "ARROW_RIGHT":
                    state.getShot().incrementPower();
                    break;
                case "SPACEBAR":
                    shootBall(state.getPlayer(), state.getBall(), state.getShot());
                    break;
                case "ENTER":
                    state.getPlayer().hold(state.getBall());
                    break;
            }
        }
    }

    /**
     * Calculates the vertical velocity and the horizontal velocity imparted by the give power and angle
     * and applies that to the ball.  Also makes the player let go of the ball.
     */
    private void shootBall(PlayerModel player, BallModel ball, Shot shot) {
        double xVelocity = shot.getPower() * Math.cos(Math.toRadians(shot.getAngle()));
        double yVelocity = shot.getPower() * Math.sin(Math.toRadians(shot.getAngle()));
        ball.setxVelocity(xVelocity);
        ball.setyVelocity(yVelocity);
        player.letGoOfBall();
    }
}
