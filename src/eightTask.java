import java.util.ArrayList;

public class eightTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, -7, 8, 9, 0},
                {9, 8, 7, 6, 5},
                {4, 3, -2, 1, 0},
                {1, 3, 5, 7, -9},
        };
        sum(ar1);
    }

    public static void sum(int[][] ar) {
        ArrayList<Integer> sumRow = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] < 0) {
                    for (int k = 0; k < ar[i].length; k++) {
                        sum += ar[i][k];
                    }
                    sumRow.add(sum);
                    sum = 0;
                }
            }
        }
        for (int i = 0; i < sumRow.size(); i++) {
            System.out.print("|" + sumRow.get(i) + "|");
        }
    }
}
