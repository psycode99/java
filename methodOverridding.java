public class methodOverridding {
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speaks();
        dog.speaks();

    }
}


class Animal{
    void speaks(){
        System.out.println("this animal speaks");
    }
}

class Dog extends Animal{
    void speaks(){
        System.out.println("The dog barks!");
    }
}