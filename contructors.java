public class contructors {
    public static void main(String[] args) {
        Human human1 = new Human("Rick", 65, 80);
        Human human2 = new Human("Max", 19, 40);

        human2.drink();
        human1.eat();
    }
}

class Human{
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void drink(){
        System.out.println(this.name+" is drinking *burp*");
    }

    void eat(){
        System.out.println(this.name+" is eating");
    }
}
