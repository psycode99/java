public class arrays {

    public static void main(String[] args) {
        String[] cars = {"BMW", "Challenger", "Camaro"};
        cars[0] = "Mustang";

        String[] supercars = new String[3];
        supercars[0] = "Ferrari";
        supercars[1] = "Lykan Hypersport";
        supercars[2] = "Lamborghini";

        for (int i=0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println();

        for (int j=0; j < supercars.length; j++){
            System.out.println(supercars[j]);
        }
    }
}
