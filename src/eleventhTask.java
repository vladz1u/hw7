public class eleventhTask {
    public static void main(String[] args) {
        int[][] ar1 = {
                {1, 2, 3, 4, 5, 6},
                {6, 7, 8, 9, 0, 7},
                {9, 8, -7, 6, 5, 0},
                {4, 3, 2, -1, 0, 0},
                {1, 3, 5, 7, -9, 0},
        };
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                System.out.printf("%3d ", ar1[i][j]); //Спитав у чата гпт як красиво вивести
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
        isNull(ar1);
    }

    public static void isNull(int[][] ar) {
        int number = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == 0) {
                    number += 1;
                    ar[i][j] = number;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.printf("%3d ", ar[i][j]); //Спитав у чата гпт як красиво вивести
            }
            System.out.println("");
        }
    }
}
