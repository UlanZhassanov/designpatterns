package creational.factoryPattern.factory;

import creational.factoryPattern.balls.Ball;
import creational.factoryPattern.balls.BasketballBall;

public class MakingBasketballBall extends MakingBalls{
    @Override
    public Ball makeBall() {
        return new BasketballBall();
    }

}
