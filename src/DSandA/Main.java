package DSandA;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();

        int[] restarts = new int[n];
        int[][] servers = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                servers[i][j] = m;
            }
        }

        for (int i = 0; i < q; i++) {
            String[] query = scanner.nextLine().split(" ");
            switch (query[0]) {
                case "RESET" -> {
                    int dc = Integer.parseInt(query[1]) - 1;
                    restarts[dc] += 1;
                    for (int j = 0; j < m; j++) {
                        servers[dc][j] = m;
                    }
                }
                case "DISABLE" -> {
                    int dc = Integer.parseInt(query[1]) - 1;
                    int server = Integer.parseInt(query[2]) - 1;
                    servers[dc][server] = 0;
                }
                case "GETMAX" -> {
                    int maxProd = -1;
                    int maxDc = -1;
                    for (int j = 0; j < n; j++) {
                        int prod = restarts[j] * sum(servers[j]);
                        if (prod > maxProd) {
                            maxProd = prod;
                            maxDc = j;
                        }
                    }
                    System.out.println(maxDc + 1);
                }
                case "GETMIN" -> {
                    int minProd = Integer.MAX_VALUE;
                    int minDc = -1;
                    for (int j = 0; j < n; j++) {
                        int prod = restarts[j] * sum(servers[j]);
                        if (prod < minProd) {
                            minProd = prod;
                            minDc = j;
                        }
                    }
                    System.out.println(minDc + 1);
                }
            }
        }
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }
}

