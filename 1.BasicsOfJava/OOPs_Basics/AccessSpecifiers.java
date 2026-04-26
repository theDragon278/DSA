class Test {
    public static void printTest() {
        System.out.println("This is a test method.");
    }
}

class Name {
    public void printName() {
        System.out.println("My Name is Ambarish");
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        Test.printTest();

        Name name = new Name();
        name.printName();
    }
}
