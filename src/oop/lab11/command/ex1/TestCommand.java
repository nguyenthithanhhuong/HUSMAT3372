package oop.lab11.command.ex1;

public class TestCommand {
    public static void main(String[] args){
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch aSwitch = new Switch();

        aSwitch.storeAndExecute(restart);
        aSwitch.storeAndExecute(shutdown);
    }
}
