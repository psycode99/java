import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        while (name.isBlank()) {
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }

        System.out.println("hello "+ name);
        scanner.close();
    }
    
}
