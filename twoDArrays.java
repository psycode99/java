public class twoDArrays {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "Ferrari Daytona";
        cars[0][1] = "Lamborghini Revuelto";
        cars[0][2] = "Bugatti Chiron";
        cars[1][0] = "Ford Mustang";
        cars[1][1] = "Dodge Challenger";
        cars[1][2] = "Chevy Camaro";
        cars[2][0] = "Rolls Royce";
        cars[2][1] = "Bentley";
        cars[2][2] = "Range Rover";

        for (int i=0; i < cars.length; i++){
            System.out.println();
            for (int j=0; j < cars[i].length; j++){
                System.out.println(cars[i][j]);
            }
        }

        String[][] hypercars = {{"Dodge Challenger", "Dodge Vyper", "Dodge Charger"},
        {"Lamborghini Aventador", "Lamborghini Urus", "Lamborghini Huracan"},
        {"Bugatti Veyron", "Bugatti Divo", "Bugatti Chiron"}};

        hypercars[2][0] = "Bugatti Mistral";

        for (int i=0; i < hypercars.length; i++){
            System.out.println();
            for (int j=0; j < hypercars[i].length; j++){
                System.out.println(hypercars[i][j]);
            }
        }

    }
}
