package creational.abstractFactory.football;

import creational.abstractFactory.Boots;
import creational.abstractFactory.Uniform;
import creational.abstractFactory.UniformSetFactory;

public class FootballUniformSetFactory implements UniformSetFactory {
    @Override
    public Uniform createUniform() {
        return new FootballUniform();
    }

    @Override
    public Boots createBoots() {
        return new FootballBoots();
    }
}
