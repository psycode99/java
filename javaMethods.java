public class javaMethods {
    
    public static void main(String[] args) {
        int x = 1;
        int y = 7;

        int z = add(x, y);
        System.out.println(z);
        user("favor", 12, "georgefavour467@gmail.com");

    }

    static int add(int x, int y){
        int z = x + y;
        return z;
    }

    static void user(String name, int age, String email){
        System.out.println("hello "+ name);
        System.out.println("you are "+ age);
        System.out.println("We've sent a confirmation email to your address at "+ email);
    }
}
