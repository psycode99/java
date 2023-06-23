import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        ///double a = 3.14; 
        ///double b = -10;

        ///double c = Math.max(a, b);
        ///double c = Math.min(a, b);
        ///double c = Math.abs(b);
        ///double c = Math.round(a);
        ///double c = Math.floor(a);
        ///double c = Math.ceil(a);
        ///double c = Math.sqrt(a);
        ///double c = Math.sqrt(Math.abs(b));

        
        ///System.out.println(c);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of Height ");
        double height = scanner.nextDouble();

        System.out.println("Value of Base");
        double base = scanner.nextDouble();
        scanner.close();

        double hypotenuse = Math.pow(height, 2) + Math.pow(base, 2);
        hypotenuse = Math.sqrt(hypotenuse);

        System.out.println("Hypotenuse = "+hypotenuse);




    }
}
