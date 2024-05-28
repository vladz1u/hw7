import java.util.ArrayList;

public class fourteenthTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 1},
                {6, 1, 8, 1, 0},
                {9, 8, 1, 6, 5},
                {4, 1, 2, 1, 0},
                {1, 3, 5, 7, 1},
        };
        amountDef(ar1, 1);
    }

    public static void amountDef(int[][] ar, int num) {
        ArrayList<Integer> amount = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (num == ar[i][j]) {
                    count += 1;
                    amount.add(ar[i][j]);
                }
            }
        }
        System.out.println("В двомірному масиві є "+ count + " ваших числа(Ваше число "+ num + ")");
    }
}
