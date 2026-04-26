class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        if (age != 0) {
            System.out.println("Age: " + age);
        }
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Person p1 = new Person("Ambarish");
        Person p2 = new Person("Ambarish Behera", 21);

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
    }
}
