public class sixthTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, -7, 8, 9, 0},
                {9, 8, 7, 6, 5},
                {4, 3, 2, 1, 0},
                {1, 3, 5, 7, 9},
        };
        isPositive(ar1);
    }

    public static void isPositive(int[][] ar) {
        boolean isPositive = true;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i][i] < 0) {
                isPositive = false;
                System.out.println("В головній діагоналі двохмірного масиву є від`ємні числа.");
                break;
            }
        }
    }
}