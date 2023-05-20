package oop.lab11.builder.ex1;

public class Manual {
    private int seats;
    private String engineName;
    private boolean hasTripComputer;
    private boolean hasGPS;

    public int getNumSeats() {
        return seats;
    }

    public void setNumSeats(int numSeats) {
        this.seats = numSeats;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public boolean isHasTripComputer() {
        return hasTripComputer;
    }

    public void setHasTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
}
