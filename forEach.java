import java.util.ArrayList;

public class forEach {

    public static void main(String[] args) {
        //String[] animals = {"cat", "dog", "fish"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("fish");

        for (String i : animals){
            System.out.println(i);
        }
    }
}
