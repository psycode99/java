public class arrayOfObjects {
    
    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Pasta");
        Food food3 = new Food("Noodles");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        
    }
}

class Food {
    String name;

    Food(String name){
        this.name = name;

    }
}
