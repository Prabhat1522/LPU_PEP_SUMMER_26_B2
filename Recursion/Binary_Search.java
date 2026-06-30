public class Binary_Search {
    public static boolean binarySearch(int[] arr, int left, int right, int key) {
        if(left > right) return false;
        int mid = left + (right - left) / 2;

        if(arr[mid] == key) return true;
        else if(arr[mid] < key) {
            return binarySearch(arr, mid + 1, right, key);
        } else {
            return binarySearch(arr, left, mid - 1, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 13};
        int key = 5;
        System.out.println(binarySearch(arr, 0, arr.length-1,key));
    }
}
