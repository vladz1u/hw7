public class twelvethTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 1},
                {6, 1, 8, 1, 0},
                {9, 8, 1, 6, 5},
                {4, 1, 2, 1, 0},
                {1, 3, 5, 7, 1},
        };
        isEqual(ar1);
    }

    public static void isEqual(int[][] ar) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < ar.length; i++) {
            sum1 += ar[i][i];
        }
        for (int i = 0; i < ar.length; i++) {
            sum2 += ar[i][ar.length - 1 - i];
        }
        if (sum1 == sum2){
            System.out.println("Сума головної та протилежної діагоналі рівні: " + sum1 +  " = " + sum2);
        }else
            System.out.println("Сума головної та протилежної діагоналі не рівні");
    }
}