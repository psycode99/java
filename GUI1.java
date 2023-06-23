import javax.swing.JOptionPane;

public class GUI1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your Name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Your Height: "));
        JOptionPane.showMessageDialog(null,
         "hello " + name + " You are " + age + " Years old and " + height + "cm tall!");
    }
}
