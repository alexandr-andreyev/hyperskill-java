package life;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int S = scanner.nextInt(); //Семя рандома
        String[][] lifeMatrix = new String[N][N];
        Random random = new Random(S);

        for (int i = 0; i < lifeMatrix.length; i++) {
            for (int j = 0; j < lifeMatrix.length; j++) {
                if (random.nextBoolean()) {
                    lifeMatrix[i][j] = "O";
                } else {
                    lifeMatrix[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < lifeMatrix.length; i++) {
            for (int j = 0; j < lifeMatrix.length; j++) {
                System.out.print(lifeMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
