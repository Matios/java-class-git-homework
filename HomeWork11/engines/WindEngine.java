package engines;

import models.GameModel;

public class WindEngine{
    public void updateState(GameModel state) {
        double oldxVelocity = state.getBall().getxVelocity();
        state.getBall().setxVelocity(oldxVelocity - .1);//- 1
    }
}