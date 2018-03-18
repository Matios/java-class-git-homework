package engines;

import misc.GameState;
import models.BallModel;
import models.PlayerModel;

public interface EngineInterface{
	public void updateState(GameState state);
}