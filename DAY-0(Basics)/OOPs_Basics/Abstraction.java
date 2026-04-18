abstract class TV {
    abstract void turnOn();

    abstract void turnOff();
}

class TVRemote extends TV {
    void turnOn() {
        System.out.println("Turning on the TV...");
    }

    void turnOff() {
        System.out.println("Turning off the TV...");

    }
}

public class Abstraction {
    public static void main(String[] args) {
        TVRemote remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
