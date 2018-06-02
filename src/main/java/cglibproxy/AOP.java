package cglibproxy;

import java.util.UUID;

public class AOP {
    public static void main(String[] args) {
        OrderManager order = (OrderManager) new CGLibProxy().createProxyObject(new OrderManager("ADU"));
        order.save(UUID.randomUUID(), "ADU");
    }
}
