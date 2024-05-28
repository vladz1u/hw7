import java.util.ArrayList;


public class seventhTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, -7, 8, 9, 0},
                {9, 8, 7, 6, 5},
                {4, 3, 2, 1, 0},
                {1, 3, 5, 7, 9},
        };
        changeRows(ar1);
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                System.out.print(ar1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void changeRows(int[][] ar) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < ar[0].length; i++) {
            tmp.add(ar[0][i]);
        }

        for (int i = 0; i < ar[0].length; i++) {
            ar[0][i] = ar[1][i];
        }

        for (int i = 0; i < ar[1].length; i++) {
            ar[1][i] = tmp.get(i);
        }
    }
}