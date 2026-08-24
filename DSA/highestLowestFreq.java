import java.util.HashMap;

public class highestLowestFreq {
    static int[] highLowFreq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int val:arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        int maxFreq=Integer.MIN_VALUE;
        int maxFreqWaliKey=-1;
        for(int key: map.keySet()){
            int currentKey=key;
            int currentKeyKiFreq=map.get(key);
            if(currentKeyKiFreq>maxFreq){
                maxFreq=currentKeyKiFreq;
                maxFreqWaliKey=currentKey;
            }
        }
        int lowestFreq=Integer.MAX_VALUE;
        int lowestFreqWaliKey=-1;
        for(int key: map.keySet()){
            int currentKey=key;
            int currentKeyKiFreq=map.get(key);
            if(currentKeyKiFreq<maxFreq){
                lowestFreq=currentKeyKiFreq;
                lowestFreqWaliKey=currentKey;
            }
        }
        int[] ans={ maxFreqWaliKey,lowestFreqWaliKey};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={3,5,5,4,4,4,4,4,5,3,3};
        int [] ansArr=highLowFreq(arr);
        System.out.println("Highest Frequency: "+ansArr[0]);
        System.out.println("Lowest Frequency: "+ansArr[1]);
    }
}
