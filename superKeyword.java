public class superKeyword {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ironman", 40, "Intelligence");
        Hero hero2 = new Hero("Batman", 43, "$$$$$$");

        System.out.println(hero1.toString());
        System.out.println();
        System.out.println(hero2.toString());
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }



}

class Hero extends Person{
    String power;

    Hero(String name, int age, String power){
        super(name, age);
        this.power = power;
    }

    
    public String toString(){
        return name + " " + age + " " + power;
    }
}
