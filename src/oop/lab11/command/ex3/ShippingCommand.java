package oop.lab11.command.ex3;

public class ShippingCommand implements OrderCommand {
    private Order order;
    private String method;

    public ShippingCommand(Order order, String method) {
        this.order = order;
        this.method = method;
    }
    @Override
    public void execute() {
        order.setShippingMethod(method);
    }
}
