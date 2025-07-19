public class Jump_Game {
    public boolean can_jump(int []nums){
        int max_reach=0;
        for(int i=0;i<nums.length;i++){
           if(i>max_reach){
               return false;
           }
           max_reach= Math.max(max_reach,i+nums[i]);
           if(max_reach>=nums.length){
               return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr ={2,3,1,1,4};
        Jump_Game jump = new Jump_Game();
        System.out.println(jump.can_jump(arr));
    }
}
