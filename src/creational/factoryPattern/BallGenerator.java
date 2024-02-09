package creational.factoryPattern;

import creational.factoryPattern.balls.Ball;
import creational.factoryPattern.factory.MakingBalls;
import creational.factoryPattern.factory.MakingFootballBall;
import creational.factoryPattern.factory.MakingTennisBall;

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
