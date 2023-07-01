public class javaInheritance {
    
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();
        HybridCar hybrid_car = new HybridCar();

        car.go();
        bike.go();
        hybrid_car.go();
        car.refueling();
        hybrid_car.recharge();
        hybrid_car.refueling();
    }
}


class Vehicle{
    double speed;

    void go(){
        System.out.println("This vehicle is moving");
    }

    void brake(){
        System.out.println("This vehicle is coming to a halt");
    }
}

class Car extends Vehicle{
    int doors = 4;
    int wheels = 4;

    void refueling(){
        System.out.println("This car is refueling");
    }
}

class Bicycle extends Vehicle{
    int wheels = 2;

}


class HybridCar extends Car{
    void recharge(){
        System.out.println("This car is recharging");
    }
}
