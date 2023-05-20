package oop.lab11.command.ex3;

public class PaymentCommand implements OrderCommand {
    private Order order;
    private String method;

    public PaymentCommand(Order order, String method) {
        this.order = order;
        this.method = method;
    }
    @Override
    public void execute() {
        order.setShippingMethod(method);
    }

}
