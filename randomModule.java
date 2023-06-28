import java.util.Random;

public class randomModule {
    
    public static void main(String[] args) {
        Random random = new Random();

        //int x = random.nextInt(6)+1;
        //double y = random.nextDouble();
       // boolean z = random.nextBoolean();
        int x = random.nextInt(10, 30);

        System.out.println(x);
    }    
}

