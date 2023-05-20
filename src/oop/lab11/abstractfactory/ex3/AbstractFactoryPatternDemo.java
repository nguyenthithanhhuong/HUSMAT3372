package oop.lab11.abstractfactory.ex3;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("Rectangle");
        shape3.draw();
    }
}
