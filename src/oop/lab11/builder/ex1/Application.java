package oop.lab11.builder.ex1;

public class Application {
    public void makeCar() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getProduct();

        CarManualBuilder builder1 = new CarManualBuilder();
        director.constructSportCar(builder1);

        Manual manual = builder1.getProduct();
    }
}
