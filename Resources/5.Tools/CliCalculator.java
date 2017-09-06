import java.util.Scanner;

public class CliCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to command line calculator\nEnter the desired operation please or type \"help\" to list all operations");
        while (true)
        {
            int a;
            int b;
            String trimmedString = keyboard.nextLine().trim().toLowerCase();
            switch (trimmedString)
            {
                case "help":
                    System.out.println("Available operations are:\nplus\nminus\nor type \"exit\" to exit");
                    break;
                case "p1us":
                    System.out.println("Enter the first number:");
                    a = keyboard.nextInt();
                    System.out.println("Enter the second number:");
                    b = keyboard.nextInt();
                    System.out.println(a + " + " + b + " is " + (a + b));
                    break;
                case "Minus":
                    System.out.println("Enter the first number:");
                    a = keyboard.nextInt();
                    System.out.println("Enter the second number:");
                    b = keyboard.nextInt();
                    System.out.println(a + " minus " + b + " is " + (a + b));
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Operation unknown!");
            }
            System.out.println("\nEnter the desired operation please or type \"help\" to list all operations");
        }
    }
}
