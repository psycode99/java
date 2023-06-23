import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {
        int rows;
        int cols;
        String symbol =  "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter nr. of rows ");
        rows = scanner.nextInt();

        System.out.println("Enter nr. of columns ");
        cols = scanner.nextInt();

        System.out.println("Enter Symbol ");
        symbol = scanner.next();

        for (int i=1; i <= rows; i++){
            System.out.println();
            for (int j=1; j <= cols; j++){
                System.out.print(symbol);
            }
        }
        scanner.close();


    }
}
