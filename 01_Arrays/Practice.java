public class Practice {
    public static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = {12, 32, 55, 1, 26, 53, 78};
        // int target = 53;
        // int ans = linearSearch(arr, target);
        // if(ans == -1) {
        //     System.out.println("Target not found");
        // } else {
        //     System.out.println("Target found at index: " + ans);
        // }

        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;
        int ans = binarySearch(arr, key);
        if(ans == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + ans);
        }


    }
}