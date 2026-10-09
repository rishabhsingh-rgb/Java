class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder();
        int n=num1.length();
        int m=num2.length();
        int carry=0;
        int i=n-1;
        int j=m-1;
        if(n==1 &&m==1){
            int sum=(num1.charAt(0)-'0') + (num2.charAt(0)-'0');
            carry=sum/10;
            ans.append(sum%10);
            if(carry!=0){
                ans.append(carry);
            }
        }
        else{
            while(i>=0 || j>=0){
                if(i>=0 && j>=0){
                    int sum = (num1.charAt(i)-'0') + (num2.charAt(j)-'0') + carry;
                    ans.append(sum%10);
                    sum=sum/10;
                    carry=sum;
                    i--;
                    j--;
                }
                else if(i<0 && j>=0){
                    ans.append(((num2.charAt(j)-'0')+carry)%10);
                    carry=((num2.charAt(j)-'0')+carry)/10;
                    j--;
                }
                else if(i>=0 && j<0){
                    ans.append(((num1.charAt(i)-'0')+carry)%10);
                    carry=((num1.charAt(i)-'0')+carry)/10;
                    i--;
                }

            }
            if(carry!=0){
                ans.append(carry);
            }
        }
        return ans.reverse().toString();
        
    }
}
