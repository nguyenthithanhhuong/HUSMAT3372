package oop.lab11.builder.ex1;

public interface Builder {
    public Builder reset();
    public Builder setSeats(int numSeats);
    public Builder setEngine(String engineName);
    public Builder setTripComputer(boolean hasTripCompute);
    public Builder setGPS(boolean hasGPS);
}
