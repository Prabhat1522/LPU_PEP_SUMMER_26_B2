public class ReverseArray {
    public static void reverseArr(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int[] arr = {5, 7 , 8, 11, 12};
        reverseArr(arr);
        printArr(arr);

    }
}
