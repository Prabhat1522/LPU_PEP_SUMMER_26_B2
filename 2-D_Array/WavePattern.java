public class WavePattern {
    public static void wavepattern(int[][] arr, int row, int col) {
        for(int c=0;c<col;c++) {
            if(c%2==0){
                for(int r=0;r<row;r++) {
                    System.out.println(arr[r][c]);
                }
            } else {
                for(int r=row-1;r>=0;r--){
                    System.out.println(arr[r][c]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        wavepattern(arr, 3, 3);
    }
}
