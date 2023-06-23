import java.util.Scanner;

public class ifstatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you");
        int age = scanner.nextInt();

        if (age >= 18){
            if (age > 75){
                System.out.println("Are you sure you want to drive granny? true/false");
                boolean grams = scanner.nextBoolean();

                if (grams == true){
                    System.out.println("Farewell to you granny");
                }
                else{
                    System.out.println("Park and call a relative");
                }
            }
            else{
                System.out.println("Are you drunk? true/false ");
                boolean drunk = scanner.nextBoolean();
    
                if (drunk == true){
                    System.out.println("Park the car");
                }
                else{
                    System.out.println("Keep driving");
                }
        }
        
        }
        else{
            System.out.println("Are your parents at home? in/out");
            String parents = scanner.next();

            if (parents.equalsIgnoreCase("in")){
                System.out.println("I will call their punk ass to pick you up now");
            }
            else if (parents.equalsIgnoreCase("out")){
                System.out.println("Well you better get home before they do,  clown");
            }
            else{
                System.out.println("I do not care where your parents are, get out!");
            }
        }
        scanner.close();
    }
}
