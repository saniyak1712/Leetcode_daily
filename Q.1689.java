class Solution {
    public int minPartitions(String n) {
        int ans = 0;

        for(char x : n.toCharArray()){
            int curr = x-'0';

            ans = Math.max(ans , curr);
        }

        return ans;
    }
}
