public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for(char i:s.toCharArray()) {
            arr[i-'a']++;
        }
        for(char i:t.toCharArray()) {
            arr[i-'a']--;
            if(arr[i-'a'] < 0) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

        
    }
}
