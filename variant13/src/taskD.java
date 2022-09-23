public class taskD {
    public static int[][] GetResult(int[][] matrix) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > alphabet.length()) {
                    matrix[i][j] = alphabet.charAt((matrix[i][j] - 1) % alphabet.length());
                } else {
                    matrix[i][j] = alphabet.charAt(matrix[i][j] - 1);
                }
            }
        }

        return matrix;
    }
}
