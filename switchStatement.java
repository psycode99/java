public class switchStatement {
    public static void main(String[] args) {
        String day = "meeka";

        switch (day) {
            case "Monday":
            System.out.println("Tis Monday o lazy one");    
            break;

            case "Tuesday":
            System.out.println("Wake o child on this merry Tuesday");
            break;

            case "Wednesday":
            System.out.println("Don't be full of folly on this blessed Wednesday");
            break;

            case "Thursday":
            System.out.println("Make hay on this high Thursday");
            break;

            case "Friday":
            System.out.println("Man let's go smoke some weed its Friday");
            break;
        
            default:
            System.out.println("Its either Saturday or Sunday or No day, either ways fuck off");
                break;
        }
    }
}
