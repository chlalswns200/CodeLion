package day6;

interface Drivable {
    public abstract void drive();
}

interface Flyable {
    void fly();
}

class FlyingCar implements Drivable, Flyable {

    @Override
    public void fly() {
        System.out.println("날 수 있습니다.");
    }

    @Override
    public void drive() {
        System.out.println("드라이브가 가능합니다");
    }
}

public class MultiExEx {
    public static void main(String[] args) {
        FlyingCar flyingCar = new FlyingCar();
        flyingCar.drive();
        flyingCar.fly();
    }
}
