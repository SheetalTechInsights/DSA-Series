import java.util.HashSet;

public class LongestSubString {
    public static int max_length_string(String s){
       int start = 0;
       int max_length=0;
       int n=s.length();
        HashSet<Character> set = new HashSet<>();

       for(int end =0;end<n;end++){
          char current_char = s.charAt(end);
          while(set.contains(current_char)){
          set.remove(s.charAt(start));
          start++;
          }
           set.add(current_char);
           max_length=  Math.max(max_length,end-start+1);
       }
     return max_length;
    }
    public static void main(String[] args) {
       String s = "sheetal";
        System.out.println(LongestSubString.max_length_string(s));
    }
}
