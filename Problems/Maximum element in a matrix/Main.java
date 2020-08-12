import java.util.*;
class Main {
    public static void main(String[] args) {
        	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        int max = Integer.MIN_VALUE;
        int resultX = 0;
        int resultY = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    resultX = i;
                    resultY = j;
                }
            }
        }

        System.out.println(resultX + " " + resultY);
    }
}
