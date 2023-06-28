import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> Dogs = new ArrayList<String>();
        Dogs.add("German Shepherd");
        Dogs.add("Husky");
        Dogs.add("Labrador");

        Dogs.set(2, "Chihuahua");
        Dogs.remove(2);
        Dogs.clear();

        for (int i=0; i < Dogs.size(); i++){
            System.out.println(Dogs.get(i));
        }
    }   
}
