class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating...");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking...");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing...");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.bark();
        dog.eat();

        Cat cat = new Cat("Whiskers");
        cat.meow();
        cat.eat();
    }
}
