public class staticKeyword {
    public static void main(String[] args) {

        Cars[] cars = new Cars[5];

        Cars car1 = new Cars("Dodge Challenger");
        Cars car2 = new Cars("Mustang");
        Cars car3 = new Cars("Camaro");
        Cars car4 = new Cars("Lykan Hypersport");
        Cars car5 = new Cars("Pagani");

        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        Cars.displayCars();
        Cars.listCars(cars);
        
    }
}


class Cars{
    static int numberOfCars;

    String name;

    Cars(String name){
        this.name = name;
        numberOfCars++;
    }

    public String toString(){
        return name;
    }


    static void displayCars(){
        System.out.println("you have "+numberOfCars+" cars");
    }

    static void listCars(Cars[] cars){
        for (int i=0; i < cars.length; i++){
            System.out.println(i+1 + " " + cars[i].toString());
        }
    }

}
