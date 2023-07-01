public class toStringMethod {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);

    }
}


class Car {
    String make = "Dodge";
    String model = "Challenger SRT";
    int year = 2021;

    @Override
    public String toString() {
        return make + " --" + model + " --" + year;
    }
}


    
