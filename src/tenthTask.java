public class tenthTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, -7, 6, 5},
                {4, 3, 2, -1, 0},
                {1, 3, 5, 7, -9},
        };
        isNegative(ar1);
    }
    public static void isNegative(int[][]ar){
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if(ar[i][j] < 0){
                    count += 1;
                }
            }
        }
        System.out.println("В масиві "+count+" від`ємних чисел");
    }
}
