package abstractFactory.football;

import abstractFactory.Boots;
import abstractFactory.Uniform;
import abstractFactory.UniformSetFactory;

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
