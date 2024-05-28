import java.util.ArrayList;

public class fourthTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, 7, 6, 5},
                {4, 3, 2, 1, 0},
                {1, 3, 5, 7, 9}
        };
        lowestColumn(ar1);
    }

    public static void lowestColumn(int[][] ar) {
        ArrayList<Integer> minRow = new ArrayList<>();
        for (int i = 0; i < ar[0].length; i++) {
            int min = ar[i][0];
            for (int j = 0; j < ar.length; j++) {
                if (min > ar[j][i]){
                    min = ar[j][i];
                }
            }
            minRow.add(min);
        }
        for (int i = 0; i < minRow.size(); i++) {
            System.out.print("|"+minRow.get(i)+"|");
        }
    }
}
