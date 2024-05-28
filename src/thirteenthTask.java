public class thirteenthTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 1},
                {6, 1, 8, 1, 0},
                {9, 8, 1, 6, 5},
                {4, 1, 2, 1, 0},
                {1, 3, 5, 7, 1},
        };
        sumDiagonal(ar1);

    }
    public static void sumDiagonal(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i][i];
        }
        System.out.println("Сума лівої діагоналі: "+ sum);
    }
}
