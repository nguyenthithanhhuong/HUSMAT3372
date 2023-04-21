package oop.lab09.ex2p1;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = null;
        long dayDiffs = 0;
        for (Rent rent : rents) {
            if ((rent != null) && (rent.getDaysDiff() > dayDiffs)) {
                longestRent = rent;
            }
        }
        return longestRent;
    }
}
