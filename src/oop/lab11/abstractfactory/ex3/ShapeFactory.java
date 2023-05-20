package oop.lab11.abstractfactory.ex3;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type){
        if(type.equals("Rectangle")){
            return new UnRoundedRectangle();
        }else if(type.equals("Square")){
            return new UnRoundedSquare();
        }
        return null;
    }
}
