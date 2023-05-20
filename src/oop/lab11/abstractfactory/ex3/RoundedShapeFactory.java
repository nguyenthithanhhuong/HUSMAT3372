package oop.lab11.abstractfactory.ex3;

public class RoundedShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String type) {
        if(type.equals("Rectangle")){
            return new RoundedRectangle();
        }else if(type.equals("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
