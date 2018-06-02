package jdkproxy;

import java.util.UUID;

public interface OrderRepository {
    public void save(UUID orderId, User user);

    public void update(UUID orderId, User user);

    public String getByName(User user);
}
