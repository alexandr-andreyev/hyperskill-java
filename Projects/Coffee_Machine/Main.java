package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // write your code here
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInMachine = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInMachine = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeInMachine = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int cupsInMachine = Math.min(Math.min(waterInMachine / 200, milkInMachine / 50), coffeeInMachine / 15);

        if (cups > cupsInMachine) {
            System.out.println("No, I can make only " + cupsInMachine + " cup(s) of coffee");
        } else if (cups == cupsInMachine) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups < cupsInMachine) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsInMachine - cups) + " more than that)");
        }

    }
}
