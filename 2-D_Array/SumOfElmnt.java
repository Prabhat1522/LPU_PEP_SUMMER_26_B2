public class SumOfElmnt {
    public static void sumofAllElements(int[][] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]) {
        int[][] arr = {{1,2,3},
                        {4,5,7},
                        {8,9,10}};
        sumofAllElements(arr);
    }
}
