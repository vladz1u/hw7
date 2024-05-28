public class fiveteenthTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        boolean result = isUnique(ar1);
        if (result) {
            System.out.println("У цьому масиві всі числа унікальні.");
        }
    }

    public static boolean isUnique(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                for (int k = 0; k < ar.length; k++) {
                    for (int l = 0; l < ar[k].length; l++) {
                        if (i == k && j == l) {
                            continue;
                        }
                        if (ar[i][j] == ar[k][l]) {
                            System.out.println("У цьому масиві не всі числа унікальні.");
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
