import java.util.ArrayList;

public class thirdTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, 7, 6, 5},
                {4, 3, 2, 1, 0},
                {1, 3, 5, 7, 9}
        };
        biggestRow(ar1);
    }

    public static void biggestRow(int[][] ar) {
        ArrayList<Integer> maxRow = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            int max = ar[i][0];
            for (int j = 0; j < ar[i].length; j++) {

                if (max < ar[i][j]){
                    max = ar[i][j];
                }
            }
            maxRow.add(max);
        }
        for (int i = 0; i < maxRow.size(); i++) {
            System.out.print(maxRow.get(i)+" ");
        }
    }
}
