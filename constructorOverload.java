public class constructorOverload {

    public static void main(String[] args) {
        Sharwarma sharwarma = new Sharwarma(true, true, false, true);

        System.out.println("these are the ingredients of your sharwarma ");
        System.out.println("Hotdog "+ sharwarma.hotdog);
        System.out.println("Chicken "+sharwarma.chicken);
        System.out.println("Extra pepper "+ sharwarma.extraPepper);
        System.out.println("Lettuce "+sharwarma.lettuce);
        
    }
    
}

class Sharwarma{
    boolean hotdog;
    boolean chicken;
    boolean extraPepper;
    boolean lettuce;

    Sharwarma(){
       System.out.println("nigga buy something or go home!");
    }

    Sharwarma(boolean hotdog){
        this.hotdog = hotdog;
    }

    Sharwarma(boolean hotdog, boolean chicken){
        this.hotdog = hotdog;
        this.chicken = chicken;
    }

    Sharwarma(boolean hotdog, boolean chicken, boolean extraPepper){
        this.hotdog = hotdog;
        this.chicken = chicken;
        this.extraPepper = extraPepper;

    }

    Sharwarma(boolean hotdog, boolean chicken, boolean extraPepper, boolean lettuce){
        this.hotdog = hotdog;
        this.chicken = chicken;
        this.extraPepper = extraPepper;
        this.lettuce = lettuce;
    }
    
}
 