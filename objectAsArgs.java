public class objectAsArgs {
    
    public static void main(String[] args) {

        Cars car1 = new Cars("Dodge Challenger");
        Garage garage = new Garage();

        garage.park(car1);
        
    }
}


class Cars {
    String name;

    Cars(String name){
        this.name = name;
    }
}

class Garage {
    void park(Cars car){
        System.out.println("The "+car.name+" is parked in the garage");
    }
}