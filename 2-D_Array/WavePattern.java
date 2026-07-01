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

    public static void spiralMatrix(int[][] arr, int row, int col) {
        int tR = 0;
        int bR = row - 1;
        int lC = 0;
        int rC = col - 1;
        while(tR <= bR && lC <= rC) {
            for(int i=lC;i<=rC;i++) {
                System.out.print(arr[tR][i]+" ");
            }
            tR++;
            for(int j = tR; j <= bR; j++) {
                System.out.print(arr[j][rC] + " ");
            }
            rC--;
            //if(tR <= bR) {
                for(int k = rC; k >= lC; k--) {
                    System.out.print(arr[bR][k] + " ");
                }
                bR--;
            //}
            //if(lC <= rC) {
                for(int l = bR; l >= tR; l--) {
                    System.out.print(arr[l][lC] + " ");
                }
                lC++;
            //}
        }

    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 12},
            {4, 5, 6, 31},
            {7, 8, 9, 17},
            {8, 9, 7, 45}
        };
        //wavepattern(arr, arr.length, arr[0].length);
        spiralMatrix(arr, arr.length, arr[0].length);

    }
}
