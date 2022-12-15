import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[] b = new int[n * n];
        for (int i = 0; i < n * n; i++)
            b[i] = sc.nextInt();
        Arrays.sort(b);
        int x = 0, y = 0, i = 0;
        while (i < n * n) {
            while (y < n && a[x][y] == 0) {
                a[x][y] = b[i];
                y++;
                i++;
            }
            x++;
            y--;
            while (x < n && a[x][y] == 0) {
                a[x][y] = b[i];
                x++;
                i++;
            }
            y--;
            x--;
            while (y >= 0 && a[x][y] == 0) {
                a[x][y] = b[i];
                y--;
                i++;
            }
            x--;
            y++;
            while (x >= 0 && a[x][y] == 0) {
                a[x][y] = b[i];
                x--;
                i++;
            }
            y++;
            x++;
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println("");
        }
    }
}
