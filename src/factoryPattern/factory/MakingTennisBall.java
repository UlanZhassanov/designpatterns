package factoryPattern.factory;

import factoryPattern.balls.Ball;
import factoryPattern.balls.TennisBall;

public class MakingTennisBall extends MakingBalls{
    @Override
    public Ball makeBall() {
        return new TennisBall();
    }

}
