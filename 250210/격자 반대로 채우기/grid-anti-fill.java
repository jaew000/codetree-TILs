import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];
        int num = 1;

       // 오른쪽에서 왼쪽으로, 지그재그로 채우기
        for (int col = n - 1; col >= 0; col--) {
            if ((n - 1 - col) % 2 == 0) { // 짝수 번째 열: 아래에서 위로 채우기
                for (int row = n - 1; row >= 0; row--) {
                    arr[row][col] = num++;
                }
            } else { // 홀수 번째 열: 위에서 아래로 채우기
                for (int row = 0; row < n; row++) {
                    arr[row][col] = num++;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
