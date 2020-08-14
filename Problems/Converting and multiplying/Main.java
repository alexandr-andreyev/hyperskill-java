import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String num = scanner.next();
            try {
                if (Integer.parseInt(num) == 0) {
                    break;
                }
                int result = Integer.parseInt(num) * 10;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + num);
            }
        }
    }
}
