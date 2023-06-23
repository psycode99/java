import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scanner.nextLine();

        System.out.println("How old are you ?");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("What is your best food");
        String food = scanner.nextLine();
        
        scanner.close();


        System.out.println("Your name is "+ name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+ food);
    }
}
