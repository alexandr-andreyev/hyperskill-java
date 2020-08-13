package encryptdecrypt;

import java.util.*;

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
        String command = "enc";
        String text = "";
        int key = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                command = args[i + 1];
            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-data")) {
                text = args[i + 1];
            }
        }
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
