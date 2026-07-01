import java.util.*;
public class DuplicateRemoval {
    public static String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!seen[ch]) {
                ans.append(ch);
                seen[ch] = true;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "geEksforGEeks";
        System.out.print(removeDuplicates(str));
        
    }
    
}
