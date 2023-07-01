import java.util.ArrayList;
import java.util.Scanner;

public class courseRepFind {

    public static void main(String[] args) {
        AddFriends.addfriends();

    }
}

class Scan {
    public static Scanner scanner = new Scanner(System.in);
}

class AddFriends {

    public static void addfriends() {

        ArrayList<String> friends = new ArrayList<String>();

        System.out.println("Enter course Rep Name: ");
        String courserep = Scan.scanner.nextLine();

        System.out.println("How many friends to add: ");
        int friendsno = Scan.scanner.nextInt();
        Scan.scanner.nextLine();

        for (int i = 0; i < friendsno; i++) {
            System.out.println("Enter name of friend to add: ");
            String name = Scan.scanner.nextLine();
            friends.add(name);

        }

        if (friends.contains(courserep)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }

        System.out.println(friends);

    }
}