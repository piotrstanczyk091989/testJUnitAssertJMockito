package pl.javaps.p4;

public class User {
    private String name;
    private boolean active;

    public User(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }
}
