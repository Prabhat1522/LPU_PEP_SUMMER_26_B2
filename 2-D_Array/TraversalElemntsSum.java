public class TraversalElemntsSum {
    public static void rowSum(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of " + i + " row is: " + sum);
        }
    }
    public static void columnSum(int[][] arr) {
        for(int j=0;j<arr[0].length;j++) {
            int sum = 0;
            for(int i=0;i<arr.length;i++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of "+ j + " column is: " + sum);
        }
    }
    public static int primaryDiagonalSum(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static int secondaryDiagonalSum(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static void main(String args[]) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rowSum(arr);
        columnSum(arr);
        System.out.println(primaryDiagonalSum(arr));
        System.out.println(secondaryDiagonalSum(arr));
    }
}
