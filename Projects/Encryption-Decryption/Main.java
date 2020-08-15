package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
        String mode = "enc";
        String data = "";
        int key = 0;
        boolean isInFile = false;
        boolean isOutFile = false;
        String pathInFileName = "";
        String pathOutFileName = "";

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    isInFile = true;
                    pathInFileName = args[i + 1];
                    break;
                case "-out":
                    isOutFile = true;
                    pathOutFileName = args[i + 1];
                    break;
                default:
                    break;
            }
        }

        if (isInFile) {
            File inFile = new File(pathInFileName);
            try (Scanner scanner = new Scanner(inFile)) {
                while (scanner.hasNext()) {
                    data = scanner.nextLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println("No file found: " + pathInFileName);
            }
        }

        char[] charsFromText = data.toCharArray();

        switch (mode) {
            case "enc" :
                if (isOutFile) {
                    File outFile = new File(pathOutFileName);
                    try (FileWriter writer = new FileWriter(outFile)) {
                        writer.write(encode(charsFromText,key));
                    } catch (IOException e) {
                        System.out.printf("An exception occurs %s", e.getMessage());
                    }
                } else {
                    System.out.println(encode(charsFromText,key));
                }
            break;
            case "dec" :
                if (isOutFile) {
                    File outFile = new File(pathOutFileName);
                    try (FileWriter writer = new FileWriter(outFile)) {
                        writer.write(decode(charsFromText,key));
                    } catch (IOException e) {
                        System.out.printf("An exception occurs %s", e.getMessage());
                    }
                } else {
                    System.out.println(decode(charsFromText,key));
                }
            break;
            default:
                break;
        }

    }
}
