import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int num = 1;

        // 대각선 시작점 (각 열부터 시작)
        for (int col = 0; col < m; col++) {
            int i = 0, j = col;
            while (i < n && j >= 0) {
                arr[i][j] = num++;
                i++;
                j--;
            }
        }

        // 대각선 시작점 (각 행부터 시작)
        for (int row = 1; row < n; row++) {
            int i = row, j = m - 1;
            while (i < n && j >= 0) {
                arr[i][j] = num++;
                i++;
                j--;
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
