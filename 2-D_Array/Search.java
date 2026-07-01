import java.util.*;
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
    public static int calculateSum(int[][] arr, int row, int col) {
        int sum = 0;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void sumRowss(int[][] arr, int row, int col) {
        for(int i=0;i<row;i++) {
            int s = 0;
            for(int j=0;j<col;j++) {
                s += arr[i][j];
            }
            System.out.println("Sum of row " + i + " is: " + s);
        }
    }
    //print the value of max sum and also also its row index
    //if multiple rows have same max sum, return the index of last row
    public static void maxSum(int[][] arr, int row, int col) {
        int mSum = Integer.MIN_VALUE;
        int mIndx = -1;
        for(int i=0;i<row;i++) {
            int sum = 0;
            for(int j=0;j<col;j++) {
                sum += arr[i][j];
            }
            if(sum > mSum) {
                mSum = sum;
                mIndx = i;
            }
        }
        System.out.println("Max sum is: " + mSum);
        System.out.println("Row index is: " + mIndx);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int key = 5;
        //System.out.println(search(arr, 3, 3, key));

        //System.out.println(calculateSum(arr, 3, 3));

        //sumRowss(arr, 3, 3);

        maxSum(arr, 3, 3);
       

    
    }
    
}
