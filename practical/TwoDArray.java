public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = {
            {3, 1, 3},
            {3, 0, 7},
            {3, 0, 5}
        };

        // Display the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

