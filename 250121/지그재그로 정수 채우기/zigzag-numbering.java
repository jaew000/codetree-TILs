import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[100][100];

        int num = 0;
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = num++;
                }
            }
            else {
                for (int i = m - 1; i >= 0; i--) {
                    arr[i][j] = num++;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}