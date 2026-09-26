class defangingIP {
    public String defangIPaddr(String address) {
        StringBuilder ans=new StringBuilder();
        int n=address.length();
        for(int i=0;i<n;i++){
            if(address.charAt(i)=='.'){
                ans.append("[.]");
            }
            else{
                ans.append(address.charAt(i));
            }
        }
        return ans.toString();
    }
}
