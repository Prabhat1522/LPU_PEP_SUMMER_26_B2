public class MaximumElements {
    public static void maxElements(int[][] arr) {
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum elements of 2-d array is: "+ max);
    }
    public static void main(String args[]) {
        int[][] arr = {{1,2,3},
                        {4,5,7},
                        {8,9,10}};
        maxElements(arr);
    }
}
