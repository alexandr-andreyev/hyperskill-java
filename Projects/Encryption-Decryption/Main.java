package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static char[] encode(char[] charsFromText,int key) {
        for (int i = 0; i < charsFromText.length; i++) {
            charsFromText[i] += key;
        }
        return charsFromText;
    }

    public static char[] decode(char[] charsFromText,int key) {
        for (int i = 0; i < charsFromText.length; i++) {
            charsFromText[i] -= key;
        }
        return charsFromText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String text = scanner.nextLine();
        int key = scanner.nextInt();
        char[] charsFromText = text.toCharArray();
        switch (command) {
            case "enc" :
            System.out.println(encode(charsFromText,key));
            break;
            case "dec" :
            System.out.println(decode(charsFromText,key));
            break;
            default:
                break;
        }

    }
}

