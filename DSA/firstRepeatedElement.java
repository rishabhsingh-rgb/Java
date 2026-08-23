import java.util.HashMap;

public class firstRepeatedElement {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num:nums){
            if(map.get(num)>1){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,3,5,6};
        System.out.println(findDuplicate(arr));
    }
}
