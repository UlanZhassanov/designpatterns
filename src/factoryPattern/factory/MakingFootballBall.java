package factoryPattern.factory;

import factoryPattern.balls.Ball;
import factoryPattern.balls.FootballBall;

public class MakingFootballBall extends MakingBalls{
    @Override
    public Ball makeBall() {
        return new FootballBall();
    }

}
