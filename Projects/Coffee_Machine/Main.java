package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int waterInMachine = 400,
            milkInMachine = 540,
            coffeeInMachine = 120,
            dispCup = 9,
            money = 550;

    public static void main(String[] args) {
        // write your code here
        showMenu();

        while (scanner.hasNext()) {
            String action = scanner.next();
            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillCoffeeMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                default:
                    break;
            }
        }
    }

    public static void showMenu () {
        System.out.println("The coffee machine has:");
        System.out.println(waterInMachine + " of water");
        System.out.println(milkInMachine + " of milk");
        System.out.println(coffeeInMachine + " of coffee beans");
        System.out.println(dispCup + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
        System.out.println("Write action (buy, fill, take):");
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int selectCoffee = scanner.nextInt();
        if (selectCoffee == 1) {
            waterInMachine -= 250;
            coffeeInMachine -= 16;
            dispCup--;
            money += 4;
        } else if (selectCoffee == 2) {
            waterInMachine -= 350;
            milkInMachine -= 75;
            coffeeInMachine -= 20;
            dispCup--;
            money += 7;
        } else if (selectCoffee == 3) {
            waterInMachine -= 200;
            milkInMachine -= 100;
            coffeeInMachine -= 12;
            dispCup--;
            money += 6;
        }

        System.out.println();
        showMenu();
    }

    public static void fillCoffeeMachine() {
        System.out.println("Write how many ml of water do you want to add:");
        waterInMachine += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        milkInMachine += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeInMachine += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        dispCup += scanner.nextInt();

        System.out.println();
        showMenu();
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
        showMenu();
    }
}
