public class WordSearch {

    public static void main(String[] args) {
        char[][] mat = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(exists(mat, word));
    }

    public static boolean exists(char[][] mat, String word) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    if (searchWord(mat, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean searchWord(char[][] mat, String word, int i, int j, int ind) {
        if (ind == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] != word.charAt(ind)) {
            return false;
        }

        char temp = mat[i][j];
        mat[i][j] = '#'; // Mark visited

        boolean found =
            searchWord(mat, word, i - 1, j, ind + 1) || // up
            searchWord(mat, word, i + 1, j, ind + 1) || // down
            searchWord(mat, word, i, j - 1, ind + 1) || // left
            searchWord(mat, word, i, j + 1, ind + 1);   // right

        mat[i][j] = temp; // backtrack
        return found;
    }
}
