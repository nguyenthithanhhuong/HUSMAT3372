package oop.lab10.singleton.ex2;

public class Aplication {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT...");
        Database bar = Database.getInstance();
        bar.query("SELECT sql");
    }
}
