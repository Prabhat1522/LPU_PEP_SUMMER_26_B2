public class RotateImgClck {
    public static void rotateClockwise(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr[0].length;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            int left = 0;
            int right = arr.length-1;
            while(left < right) {
                int temp = arr[i][right];
                arr[i][right] = arr[i][left];
                arr[i][left] = temp;
                left++;
                right--;
            }
        }
    }

    public static void antiClockwise(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr[0].length;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int j=0;j<arr.length;j++) {
            int top = 0;
            int down = arr.length-1;
            while(top < down) {
                int temp = arr[top][j];
                arr[top][j] = arr[down][j];
                arr[down][j] = temp;
                top++;
                down--;
            }
        }
    }

    public static void printMatrix(int[][] arr) {
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
        // rotateClockwise(arr);
        // printMatrix(arr);

        antiClockwise(arr);
        printMatrix(arr);

        
    }
}
