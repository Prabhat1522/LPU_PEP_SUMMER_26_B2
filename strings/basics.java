import java.util.*;
public class basics {
    public static String reverse(String str, int l, int r) {
        char[] ch = str.toCharArray();

        while(l<r) {
            char temp = ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        return new String(ch);
        
    }
    public static void main(String[] args) {
        String str = "hello";
        str = reverse(str, 0, str.length()-1);
        System.out.print(str);
    }
}
