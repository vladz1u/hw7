import java.util.ArrayList;

public class fifthTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, 7, 6, 5},
                {4, 3, 2, 1, 0},
                {1, 3, 5, 7, 9},
        };
        sumRow(ar1);
    }

    public static void sumRow(int [][] ar){
        ArrayList<Integer> sumRow = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
            }
            sumRow.add(sum);
        }
        for (int i = 0; i < sumRow.size(); i++) {
            System.out.print("|"+sumRow.get(i)+"|");
        }
    }

}
