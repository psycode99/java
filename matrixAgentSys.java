import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class matrixAgentSys {
    public static void main(String[] args) {
        Name.name();
        Wanted.wanted();
        AgentSignIn.agent();
        
    }
}


class Scan {
    public static Scanner scanner = new Scanner(System.in);
}

class Name {
    public static String name(){
        System.out.println("What is your name? ");
        String name_ = Scan.scanner.nextLine();
        return name_;
        
    }
}

class Wanted  {
    public static void wanted() {
        System.out.println("Input name to run search for:");
        String name = Scan.scanner.nextLine();
        String[] wanted = {"Neo", "Morpheous", "Tate"};

        if (Arrays.toString(wanted).contains(name)){
            System.out.println("A match!");
            System.out.println("Arrest!");
        }

        else{
            System.out.println("No match found");
        }


    }
}



class AgentSignIn {
    public static void agent() {
        System.out.println("Enter Agent Name");
        String name = Scan.scanner.nextLine();

        String[][] Agents = {{"Smith", "Lewis", "Mark"}, {"Dan", "Luke", "Biden"},
    {"Aaron", "Kalamar", "Polar"}};
    String[] commands = {"lock", "interrogate", "brainwash", "quit"};
    ArrayList<String> prisoners = new ArrayList<String>();

    if (Arrays.toString(Agents[0]).contains(name) || Arrays.toString(Agents[1]).contains(name)
     || Arrays.toString(Agents[2]).contains(name)){
        boolean contd = true;
        System.out.println("Welcome back Agent "+name);
        while (contd){
            System.out.println("What do you intend to do: Lock/ interrogate/ brainwash");
            String com_ = Scan.scanner.nextLine();
            
            if (Arrays.toString(commands).contains(com_)){
                if (com_.equals("lock")){
                    System.out.println("Input Prisoner name ");
                    String prisoner_name = Scan.scanner.nextLine();
                    if (prisoner_name.equals("quit")){
                        contd = false;
                    }
                    else{
                        prisoners.add(prisoner_name);
                        System.out.println(prisoner_name + " locked!");
                        System.out.println(prisoners);
                    }
                    
    
                }
                else if (com_.equals("interrogate")){
                    if (Arrays.toString(Agents[0]).contains(name) ||Arrays.toString(Agents[1]).contains(name) ){
                        System.out.println("Prisoner name to interrogate");
                        String prisoner_name = Scan.scanner.nextLine();
                        if (prisoners.contains(prisoner_name)){
                            System.out.println("Bringing out Prisoner "+prisoner_name);
                        }
                        else if (com_.equals("quit")){
                            contd = false;
                        }
                        else{
                            System.out.println("No such prisoner exists on our database");
                        }
                    }
                    else if (com_.equals("quit")){
                        contd = false;
                    }
                    else{
                        System.out.println("You don't have level clearance for interrogations");
                    }
                }
                else if (com_.equals("brainwash")){
                    if (Arrays.toString(Agents[0]).contains(name)){
                        System.out.println("Prisoner name to Brainwash");
                        String prisoner_name = Scan.scanner.nextLine();
                        if (prisoners.contains(prisoner_name)){
                            System.out.println("Bringing out Prisoner "+prisoner_name+ " for brainwashing");
                        }
                        else if (com_.equals("quit")){
                            contd = false;
                        }
                        else{
                            System.out.println("No such prisoner exists on our database");
                        }
    
                    }
                    else if (com_.equals("quit")){
                        contd = false;
                    }
                    else{
                        System.out.println("You don't have level clearance for brainwashing");
                    }

                }
                else{
                    contd = false;
                }
            }
            else if (com_.equals("quit")){
                contd = false;
            }
            else{
                System.out.println("Invalid command");
            }
         }
        
    
        
    }
    else{
        System.out.println("Invalid agent name");
    }

        
    }
}
 