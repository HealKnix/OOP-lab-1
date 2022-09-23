public class Main {
    public static void main(String[] args) {
        String str = "А вчера была хорошая погода. И бог с тобой, подойти к берегу реки. Ну, что ж. " +
                     "О Попе и работнике его Балде. С чего начинается родина. У старого дуба. Я учусь в школе.";
        int[][] matrix = {
                {1, 2, 3, 4},
                {16, 7, 364, 6},
                {25, 11, 999, 9},
                {9584, 22845, 295, 1}
        };

        int countA = taskA.GetResult(str);

        String strB = taskB.GetResult(str);

        String strC = taskC.GetResult(str);

        int[][] matrixD = taskD.GetResult(matrix);

        System.out.println("a) Ответ: " + countA);
        System.out.println("b) Ответ: " + strB);
        System.out.println("c) Ответ: " + strC);
        System.out.println("d) Ответ: ");
        for (int i = 0; i < matrixD.length; i++) {
            for (int j = 0; j < matrixD[i].length; j++) {
                System.out.print((char)matrixD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
