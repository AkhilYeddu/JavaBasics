import javax.swing.JOptionPane; //required

public class GUI {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"Hello"+name);
        //Joptionpane takes the input as a string by default.

        //now because of integer.parseInt, it gets converted from string to integer.
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");

        //same, converting from string to double
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your Height: "));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall.");
        
    }
    
}
