package factoryPattern.factory;

import factoryPattern.balls.Ball;

public abstract class MakingBalls {
    public abstract Ball makeBall();

    public void getParameters(){
        Ball ball = makeBall();
        System.out.println(ball.getColor());
        System.out.println(ball.getSize());
    }
}
