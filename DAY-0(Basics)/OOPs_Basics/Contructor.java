class NamePrinting {
    public NamePrinting() {
        System.out.println("This is a constructor.");
    }

    public void printName(String name) {
        System.out.println("My Name is " + name);
    }
}

public class Contructor {
    public static void main(String[] args) {
        NamePrinting name = new NamePrinting();
        name.printName("Ambarish Behera");
    }
}
