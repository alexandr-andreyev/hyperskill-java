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
    }

    public static void showMenu() {
        String action = "";

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        while (!action.equals("exit") && scanner.hasNextLine()) {
            action = scanner.nextLine();
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
                case "remaining":
                    showRemaining();
                    break;
                case "exit":
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
    }

    public static void showRemaining () {
        System.out.println("The coffee machine has:");
        System.out.println(waterInMachine + " of water");
        System.out.println(milkInMachine + " of milk");
        System.out.println(coffeeInMachine + " of coffee beans");
        System.out.println(dispCup + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
        showMenu();
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selectCoffee = scanner.nextLine();

        switch (selectCoffee){
            case ("1"):
                if (waterInMachine < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeInMachine < 16) {
                    System.out.println("Sorry, not enough milk!");
                } else if (dispCup < 1) {
                    System.out.println("Sorry, not enough discCup!");
                } else {
                    waterInMachine -= 250;
                    coffeeInMachine -= 16;
                    dispCup--;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case ("2"):
                if (waterInMachine < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkInMachine < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (dispCup < 1) {
                    System.out.println("Sorry, not enough discCup!");
                } else if (coffeeInMachine < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    waterInMachine -= 350;
                    milkInMachine -= 75;
                    coffeeInMachine -= 20;
                    dispCup--;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case ("3"):
                if (waterInMachine < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkInMachine < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (dispCup < 1) {
                    System.out.println("Sorry, not enough discCup!");
                } else if (coffeeInMachine < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    waterInMachine -= 200;
                    milkInMachine -= 100;
                    coffeeInMachine -= 12;
                    dispCup--;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":
                showMenu();
            default:
                break;
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
