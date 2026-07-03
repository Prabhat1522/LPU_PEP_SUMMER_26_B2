
import java.util.*;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
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


        System.out.println("Write the elements of matrix: ");
        //Taking user input as column wise
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Printing column wise
        for(int j=0;j<arr[0].length;j++) {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
