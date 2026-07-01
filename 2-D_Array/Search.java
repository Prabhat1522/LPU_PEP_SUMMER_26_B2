public class Search {
    public static boolean search(int[][]arr, int row, int col, int key) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    //Calculate and print the sum of every row
    public static int sumRows(int[][] arr, int row, int col) {
        int sum = 0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int key = 5;
        System.out.println(search(arr, 3, 3, key));
        System.out.println(sumRows(arr, 3, 3));
    
    }
    
}
