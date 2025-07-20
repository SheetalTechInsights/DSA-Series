import java.util.HashMap;

public class DistinctCharacterString {

    //TODO:BRUTE FORCE APPROACH:
   /* public static int longestString_With_Distinct_Char(String s,int k){
        int n = s.length();
        int max_length=0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               char curr_char= s.charAt(j);
               map.put(curr_char,map.getOrDefault(curr_char,0)+1);
                if(map.size()<=k){
                   max_length=  Math.max(max_length,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return max_length;
    }

    */
    public static int longestString_With_Distinct_Char(String s,int k){
        int left=0;
        int n = s.length();
        int max_length=0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right=0;right<n;right++){
            char curr_char=s.charAt(right);
            map.put(curr_char,map.getOrDefault(curr_char,0)-1);

            while(map.size()>k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)+1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;

            }
            max_length= Math.max(max_length,right-left+1);
       }
        return max_length;
    }
    public static void main(String[] args) {
    String s = "aaabbccd";
    int k=2;
    System.out.println(DistinctCharacterString.longestString_With_Distinct_Char(s,k));
    }
}
