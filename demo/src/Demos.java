import java.util.Scanner;

public class Demos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenhein;
        double celcius;
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenhein to Celsius.");
            System.out.println("2. Celsius to Fahrenhein.");
            System.out.println("0. Exit.");
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Fahrenhein: ");
                    fahrenhein = scanner.nextInt();
                    System.out.println("The celsius is: " + fahrenheinToCelsius(fahrenhein));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celcius = scanner.nextInt();
                    System.out.println("The fahrenhein is " + celsiusToFahrenhein(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static double fahrenheinToCelsius(double fahrenhein){
        double celsius = (5.0 / 9) * (fahrenhein - 32);
        return celsius;
    }
    public static double celsiusToFahrenhein(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}

