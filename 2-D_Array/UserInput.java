
import java.util.*;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][3];
        //Taking input rowise
        // for(int i=0;i<3;i++) {
        //     for(int j=0;j<4;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<3;i++) {
        //     for(int j=0;j<4;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        //Taking user input as column wise
        for(int i=0;i<4;i++) {
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++) {
            for(int j=0;j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
