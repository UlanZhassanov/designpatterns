package creational.abstractFactory;

import creational.abstractFactory.boxing.BoxingUniformSetFactory;

public class UniformProgram {
    public static void main(String[] args) {
        UniformSetFactory uniformSetFactory = new BoxingUniformSetFactory();

        Boots boots = uniformSetFactory.createBoots();
        Uniform uniform = uniformSetFactory.createUniform();

        boots.isFor();
        uniform.isFor();
    }
}
