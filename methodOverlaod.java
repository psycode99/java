public class methodOverlaod {
    public static void main(String[] args) {
        int a = add(1, 2);
        int b = add(1, 2, 3);
        int c = add(1, 2, 3, 4);
        double d = add(1.0, 2.0);
        double e = add(1.0, 2.0, 4.0);
        double f = add(1.0, 2.0, 3.0, 4.0);

        Integer[] interg_ = {a, b, c};
        Double[] doub_ =  {d, e, f};

        for (int i = 0; i < interg_.length; i++){
            System.out.println(interg_[i]);
        }

        for (int i = 0; i < doub_.length; i++){
            System.out.println(doub_[i]);
        }
    }

    static int add(int x, int y){
        System.out.println("overlaoded method #1");
        return x+y;
    }
    static int add(int x, int y, int z){
        System.out.println("overlaoded method #2");
        return x+y+z;
    }
    static int add(int x, int y, int z, int k){
        System.out.println("overlaoded method #3");
        return x+y+z+k;
    }

    static double add(double x, double y){
        System.out.println("overlaoded method #4");
        return x+y;
    }
    static double add(double x, double y, double z){
        System.out.println("overlaoded method #5");
        return x+y+z;
    }
    static double add(double x, double y, double z, double k){
        System.out.println("overlaoded method #6");
        return x+y+z+k;
    }

}
