import java.util.HashSet;

public class ArrayUnion {
    public static HashSet<Integer> Union(int[]arr1,int[]arr2){
        HashSet set = new HashSet<>();
        for(int i=0;i< arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j< arr2.length;j++){
            set.add(arr2[j]);
        }

        return set;
    }



    public static void main(String[] args) {
     int []array1 = {2,4,5,6,8};
     int[]array2 = {1,2,3,4,5,6};
        System.out.print(ArrayUnion.Union(array1,array2));

    }
}
