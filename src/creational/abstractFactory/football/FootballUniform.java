package creational.abstractFactory.football;

import creational.abstractFactory.Uniform;

public class FootballUniform implements Uniform {
    @Override
    public void isFor() {
        System.out.println("Для футбола, состоит из футболки, шорты и гетры");
    }
}
