import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0, y = matrix.length-1; j < n; j++, y--) {
                if ((i == j) || (j == matrix.length / 2) || (i == matrix.length / 2) || (i == y))
                {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
