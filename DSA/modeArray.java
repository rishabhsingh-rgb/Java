import java.util.HashMap;

public class modeArray {
    static int arrayMode(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        int maxFreq=-1;
        int maxFreqWaliKey=-1;
        for(int key: map.keySet()){
            int currentKey=key;
            int currentKeyKiFreq=map.get(key);
            if(currentKeyKiFreq>maxFreq){
                maxFreq=currentKeyKiFreq;
                maxFreqWaliKey=currentKey;
            }
        }
        return maxFreqWaliKey;
    }

    public static void main(String[] args) {
        int[] arr={3,5,5,6,44,56,4,5,3,3,8,5};
        System.out.println(arrayMode(arr));
    }
}
