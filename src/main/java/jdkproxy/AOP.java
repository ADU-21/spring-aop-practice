package jdkproxy;

import java.util.UUID;

public class AOP {
    public static void main(String[] args) {
        User user = new User("ADU");
        JDKProxy jdkProxy = new JDKProxy();
        OrderRepositoryImpl targetObject = new OrderRepositoryImpl(user);
        OrderRepository orderRepository = (OrderRepository) jdkProxy.createProxyInstance(targetObject);
        orderRepository.save(UUID.randomUUID(), user);
    }
}
