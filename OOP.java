public class OOP {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.model);
        System.out.println(car2.make);
        
    }
}

class Car {
    String make = "Dodge";
    String model = "Challenger";
    double price = 75000;

    void drive(){
        System.out.println("Driving");
    }

    void brake(){
        System.out.println("hold the brakes you bastard");
    }
}
