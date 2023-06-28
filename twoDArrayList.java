import java.util.ArrayList;

public class twoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> cars = new ArrayList<ArrayList<String>>();
        ArrayList<String> brokieCars = new ArrayList<String>();
        brokieCars.add("Toyota Camry");
        brokieCars.add("Honda Civic");
        brokieCars.add("Toyota Serena");

        ArrayList<String> muscleCars = new ArrayList<String>();
        muscleCars.add("Dodge Challenger");
        muscleCars.add("Ford Mustang");
        muscleCars.add("Chevy Camaro");

        ArrayList<String> hyperCars = new ArrayList<String>();
        hyperCars.add("Bugatti Chiron");
        hyperCars.add("Lamborghini Aventador");
        hyperCars.add("Ferrari Daytona");

        cars.add(brokieCars);
        cars.add(muscleCars);
        cars.add(hyperCars);

        System.out.println(cars.get(2).get(2));
    }
}
