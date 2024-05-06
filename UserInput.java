import java.util.Scanner;

public class UserInput{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("You enterd number is "+ number);
        scanner.close();
    }
}