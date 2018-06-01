import java.util.UUID;

public class OrderRepositoryImpl implements OrderRepository {
    private User user;

    public OrderRepositoryImpl() {
    }

    public OrderRepositoryImpl(User user) {
        this.user = user;
    }

    @Override
    public void save(UUID orderId, User user) {
        System.out.println(String.format("Call save with name [%s]", user.getName()));
    }

    @Override
    public void update(UUID orderId, User user) {
        System.out.println(String.format("Call update with name [%s]", user.getName()));
    }

    @Override
    public String getByName(User user) {
        String name = user.getName();
        System.out.println(String.format("Call getByName with name [%s]", name));
        return name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
