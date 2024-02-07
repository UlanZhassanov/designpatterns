package factoryPattern.factory;

import factoryPattern.balls.Ball;
import factoryPattern.balls.BasketballBall;

public class MakingBasketballBall extends MakingBalls{
    @Override
    public Ball makeBall() {
        return new BasketballBall();
    }

}
