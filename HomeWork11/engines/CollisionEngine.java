package engines;

import models.GameModel;

/**
 * Engine which applies the force of gravity to items within the game.
 */

public class CollisionEngine {
    public void updateState(GameModel state) {
        //double oldYVelocity =2;
        double oldYVelocity = state.getBall().getyVelocity();
        if (state.getBall().getY() < 0) {
            state.getBall().setY(0);
            state.getBall().setyVelocity(-(oldYVelocity/2));
        }
    }
}
