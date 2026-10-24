class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int daysTogether=0;
        int[] monthDays={0,0,31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int aliceStart=monthDays[Integer.parseInt(arriveAlice.substring(0,2))]+Integer.parseInt(arriveAlice.substring(3,5));

        int aliceEnd=monthDays[Integer.parseInt(leaveAlice.substring(0,2))]+Integer.parseInt(leaveAlice.substring(3,5));

        int bobStart=monthDays[Integer.parseInt(arriveBob.substring(0,2))]+Integer.parseInt(arriveBob.substring(3,5));

        int bobEnd=monthDays[Integer.parseInt(leaveBob.substring(0,2))]+Integer.parseInt(leaveBob.substring(3,5));
        for(int i=0;i<=365;i++){
            if(i>=aliceStart && i<=aliceEnd){
                if(i>=bobStart && i<=bobEnd){
                    daysTogether++;
                }
            }
        }
        return daysTogether;
    }
}
