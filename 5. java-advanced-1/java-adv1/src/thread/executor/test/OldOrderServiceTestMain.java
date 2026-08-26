package thread.executor.test;

public class OldOrderServiceTestMain {

    static void main() {
        String orderNo = "Order#1234";  // 예시 주문 번호
        OldOrderService orderService = new OldOrderService();
        orderService.order(orderNo);
    }
}
