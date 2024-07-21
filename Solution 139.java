class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char c[]=jewels.toCharArray();
        char s[]=stones.toCharArray();
        int co=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<c.length;j++){
                if(c[j]==s[i]){
                    co++;
                }
        }
        }
        return co;
    }
}