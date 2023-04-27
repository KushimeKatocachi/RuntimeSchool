package DSandA;

import java.util.*;

public class Mein1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int[][] dc = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dc[i], 1); // изначально все включены
        }

        int[] dr = new int[m]; // накапливаем количество перезапусков
        int[] dw = new int[n];
        Arrays.fill(dw, m);

        for (int i = 0; i < q; i++) {
            String cmd = sc.next();
            if (cmd.equals("RESET")) {
                int index = sc.nextInt();
                Arrays.fill(dc[index - 1], 1);
                dr[index - 1]++;
                dw[index - 1] = m;
            } else if (cmd.equals("DISABLE")) {
                i = sc.nextInt();
                int j = sc.nextInt();
                if (dc[i - 1][j - 1] == 1) {
                    dw[i - 1]--;
                }
                dc[i - 1][j - 1] = 0;
            } else if (cmd.equals("GETMAX")) {
                int ans = 1;
                int maxVal = Integer.MIN_VALUE;
                for (int j = 0; j < n; j++) {
                    int val = dr[j] * dw[j];
                    if (val > maxVal) {
                        maxVal = val;
                        ans = j + 1;
                    }
                }
                System.out.println(ans);
            } else if (cmd.equals("GETMIN")) {
                int ans = 1;
                int minVal = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    int val = dr[j] * dw[j];
                    if (val < minVal) {
                        minVal = val;
                        ans = j + 1;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
