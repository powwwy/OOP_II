import java.util.Random;
import java.util.Scanner;

public class Scenario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int price = rand.nextInt(50) + 1;
        System.out.println("Starting price: " + price);

        System.out.print("Do you want to 'hit' or 'stand'? ");
        String decision = scanner.nextLine().toLowerCase();

        if (decision.equals("hit")) {
            int added = rand.nextInt(30) + 1;
            price += added;
            System.out.println("You added: " + added);
        } else if (!decision.equals("stand")) {
            System.out.println("Invalid input. You stood by default.");
        }

        System.out.println("Final price: " + price);

        if (price > 25) {
            System.out.println("Too expensive!");
        } else {
            System.out.println("I'll buy!");
        }

        scanner.close();
    }
}
