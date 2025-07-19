public class StringCompressor {

    public static String compressString(String str){

        if(str == null || str.isEmpty()){
            return "";
        }
        StringBuilder result  = new StringBuilder();
        int count =1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(count).append(str.charAt(i-1));
                count = 1;
            }

        }
        result.append(count).append(str.charAt(str.length()-1));

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "wwwggoooe";
        System.out.println(StringCompressor.compressString(s));
    }
}
