package cglibproxy;

import java.util.UUID;

public class OrderManager {
    private String user = null;

    public OrderManager() {
    }

    public OrderManager(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void save(UUID orderId, String name) {
        System.out.println(String.format("Call method save(): save [%s]", name));
    }

    public void update(UUID orderId, String name) {
        System.out.println(String.format("Call method update(): update [%s]", name));
    }

    public String getByName(String name) {
        System.out.println(String.format("Call method getByName(): getByName [%s]", name));
        return name;
    }
}
