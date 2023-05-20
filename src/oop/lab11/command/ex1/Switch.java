package oop.lab11.command.ex1;

import java.util.List;
import java.util.ArrayList;


public class Switch {
    private List<Command> history = new ArrayList<Command>();

    public Switch() {
    }

    public void storeAndExecute(Command command) {
        this.history.add(command); // optional, can do the execute only!
        command.execute();
    }
}
