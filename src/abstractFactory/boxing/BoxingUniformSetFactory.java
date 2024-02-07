package abstractFactory.boxing;

import abstractFactory.Boots;
import abstractFactory.Uniform;
import abstractFactory.UniformSetFactory;

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
