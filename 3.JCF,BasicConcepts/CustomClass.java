// This a custom class that stores an integer id and a string name.
class Data {
    private int id;
    private String name;

    public Data(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Data user1 = new Data(1, "Ambarish");
        Data user2 = new Data(2, "Aditya");

        System.out.println("User 1: ID = " + user1.getId() + ", Name = " + user1.getName());
        System.out.println("User 2: ID = " + user2.getId() + ", Name = " + user2.getName());
    }
}
