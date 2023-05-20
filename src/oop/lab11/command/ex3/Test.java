package oop.lab11.command.ex3;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();

        OrderCommand shippingCommand = new ShippingCommand(order, "express");
        OrderCommand paymentCommand = new PaymentCommand(order, "credit card");

        shippingCommand.execute();
        paymentCommand.execute();
    }
}
