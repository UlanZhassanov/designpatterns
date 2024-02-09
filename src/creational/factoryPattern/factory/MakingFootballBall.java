package creational.factoryPattern.factory;

import creational.factoryPattern.balls.Ball;
import creational.factoryPattern.balls.FootballBall;

public class MakingFootballBall extends MakingBalls{
    @Override
    public Ball makeBall() {
        return new FootballBall();
    }

}
