package hello.proxy.app.v1;

public class OrderConrollerV1 implements OrderControllerV1{

    private final OrderServiceV1 orderService;

    public OrderConrollerV1(OrderServiceV1 orderService) {
        this.orderService = orderService;
    }

    @Override
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    @Override
    public String noLog() {
        return "ok";
    }
}
