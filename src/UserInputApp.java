import java.util.Scanner;

public class UserInputApp {
    // Attributes
     Scanner scanner;
     String name;
     int age;
     String Color;

    // Constructor
    public UserInputApp() {
        scanner = new Scanner(System.in);
    }

    // Method to collect user data
    public void collectUserData() {
        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        System.out.println("Enter your color:");
        Color = scanner.nextLine();
    }

    // Method to display user data
    public void displayUserData() {
        System.out.println("User Data:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + Color);
    }

    // Main method to run the application
    public static void main(String[] args) {
        UserInputApp app = new UserInputApp();

        app.collectUserData();
        app.displayUserData();
    }
}