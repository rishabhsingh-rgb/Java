//leetcode 1111
class maximumNestingDepth {
    public int[] maxDepthAfterSplit(String seq) {
        int[] result=new int[seq.length()];
        int depth = 0;

        for (int i= 0; i < seq.length(); i++) {
            char ch = seq.charAt(i);

            if (ch=='(') {
                result[i]=depth % 2;
                depth++;
            } else {
                depth--;
                result[i]=depth % 2;
            }
        }

        return result;
    }
}
