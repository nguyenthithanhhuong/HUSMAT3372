package oop.lab11.bridge.ex2;

public class Client {
    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();

        Device radio = new Radio();
        RemoteControl remoteControl1 = new AdvancedRemoteControl(radio);
        remoteControl1.togglePower();
    }
}
