import java.util.Scanner; //we should import this

public class userinput {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("what is your age?");
        int age= scanner.nextInt();
        scanner.nextLine(); // this clears the \n which stays in nextint
        System.out.println("what is your favourite food?");
        String food= scanner.nextLine();

        System.out.println("Hello "+name+"!");
        System.out.println("you are "+age +" years old");
        System.out.println("you like "+ food);

        scanner.close(); //to prevent resource leak.
        
    }
    
}
