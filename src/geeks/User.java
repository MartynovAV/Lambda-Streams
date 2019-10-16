package geeks;

public class User {
    String name, role;

    User(String a, String b) {
        name = a;
        role = b;
    }

    String getRole() {
        return role;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
