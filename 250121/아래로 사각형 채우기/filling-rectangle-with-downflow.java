import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[10][10];

        int num = 1;
        for (int j = 0; j < n; j++) { // 열 기준으로 반복
            if (j % 2 == 0) { // 짝수 열
                for (int i = 0; i < n; i++) {
                    arr[i][j] = num++;
                }
            } else { // 홀수 열
                for (int i = 0; i < n; i++) {
                    arr[i][j] = num++;
                }
            }
        }        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
}
