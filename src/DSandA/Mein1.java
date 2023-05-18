package DSandA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Mein1 {
    public static int getMinDataCenter(int[][] matrix, int[] resets, int dcCounts) {
        int min = resets[0] * countServers(matrix[0], 1);
        int minNumber = 1;
        for(int i = 1; i < dcCounts; i++) {
            int localMin = resets[i] * countServers(matrix[i], 1);
            if(min > localMin) {
                min = localMin;
                minNumber = i + 1;
            }
        }
        return minNumber;
    }

    public static int getMaxDataCenter(int[][] matrix, int[] resets, int dcCounts) {
        int max = resets[0] * countServers(matrix[0], 1);
        int maxNumber = 1;
        for(int i = 1; i < dcCounts; i++) {
            int localMax = resets[i] * countServers(matrix[i], 1);
            if(max < localMax) {
                max = localMax;
                maxNumber = i + 1;
            }
        }
        return maxNumber;
    }

    public static int countServers(int[] array, int value) {
        return (int)Arrays.stream(array).filter(item -> item == value).count();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            String[] firstLine = br.readLine().split(" ");
            int dcCounts = Integer.parseInt(firstLine[0]);
            int serverCounts = Integer.parseInt(firstLine[1]);
            int lineCounts = Integer.parseInt(firstLine[2]);

            int[][] serversMatrix = new int[dcCounts][serverCounts];
            for(int[] row: serversMatrix) {
                Arrays.fill(row, 1);
            }
            int[] resetArray = new int[dcCounts];

            for(int i = 0; i < lineCounts; i++) {
                String[] line = br.readLine().split(" ");
                String command = line[0];
                int[] argse = Arrays.stream(line).skip(1).mapToInt(Integer::parseInt).toArray();
                switch (command) {
                    case "DISABLE" -> serversMatrix[argse[0] - 1][argse[1] - 1] = 0;
                    case "RESET" -> {
                        Arrays.fill(serversMatrix[argse[0] - 1], 1);
                        resetArray[argse[0] - 1] += 1;
                    }
                    case "GETMIN" -> System.out.println(getMinDataCenter(serversMatrix, resetArray, dcCounts));
                    case "GETMAX" -> System.out.println(getMaxDataCenter(serversMatrix, resetArray, dcCounts));
                    default -> {
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }

        br.close();
    }
}

