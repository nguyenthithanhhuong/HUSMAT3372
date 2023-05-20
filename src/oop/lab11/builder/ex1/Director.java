package oop.lab11.builder.ex1;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine("D")
                .setTripComputer(true)
                .setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine("suv")
                .setTripComputer(true)
                .setGPS(true);
    }
}
