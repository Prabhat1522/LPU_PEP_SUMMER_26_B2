public class Linear_Search {
    public static boolean linear(int[] arr, int i, int key) {
        if(i >= arr.length) return false;
        if(arr[i] == key) return true;
        return linear(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 12, 20};
        int key = 11;
        System.out.println(linear(arr, 0, key));
    }
    
}
