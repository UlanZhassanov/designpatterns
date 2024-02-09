package creational.factoryPattern.factory;

import creational.factoryPattern.balls.Ball;
import creational.factoryPattern.balls.TennisBall;

public class MakingTennisBall extends MakingBalls{
    @Override
    public Ball makeBall() {
        return new TennisBall();
    }

}
