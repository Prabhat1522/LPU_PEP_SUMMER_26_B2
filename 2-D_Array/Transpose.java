public class Transpose {
    public static int[][] transpose(int[][] arr) {
        int[][] ans = new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

    public static void inPlacetranspose(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr[0].length;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void printInPlaceMatrix(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int[][] arr = {{1,2,3},
                        {4,5,7},
                        {8,9,10}};

        // int[][] result = transpose(arr);

        // for(int i=0;i<result.length;i++) {
        //     for(int j=0;j<result[0].length;j++) {
        //         System.out.print(result[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        inPlacetranspose(arr);
        printInPlaceMatrix(arr);

    }
}
