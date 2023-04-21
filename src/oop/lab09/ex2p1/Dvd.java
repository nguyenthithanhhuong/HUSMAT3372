package oop.lab09.ex2p1;

public class Dvd extends Item {
    private int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        return "Dvd[" + "duration=" + this.duration
                + ", title=" + this.getTitle() + "\'"
                + ", year=" + this.getYear() + "]";
    }
}
