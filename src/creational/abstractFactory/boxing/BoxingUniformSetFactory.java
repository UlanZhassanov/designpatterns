package creational.abstractFactory.boxing;

import creational.abstractFactory.Boots;
import creational.abstractFactory.Uniform;
import creational.abstractFactory.UniformSetFactory;

public class BoxingUniformSetFactory implements UniformSetFactory {
    @Override
    public Uniform createUniform() {
        return new BoxingUniform();
    }

    @Override
    public Boots createBoots() {
        return new BoxingBoots();
    }
}
