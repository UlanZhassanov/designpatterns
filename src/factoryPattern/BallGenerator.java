package factoryPattern;

import factoryPattern.balls.Ball;
import factoryPattern.factory.MakingBalls;
import factoryPattern.factory.MakingFootballBall;
import factoryPattern.factory.MakingTennisBall;

public class BallGenerator {

    public static void main(String[] args) {
        MakingBalls balls;

        System.out.println("Create football ball:");
        balls = new MakingFootballBall();
        balls.getParameters();


        System.out.println("Create tennisball ball:");
        Ball ball = new MakingTennisBall().makeBall();
        System.out.println(ball.getColor());
        System.out.println(ball.getSize());

    }


}
