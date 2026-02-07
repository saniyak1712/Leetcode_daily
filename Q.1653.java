class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();

        int deletions = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                if(!st.isEmpty() && st.peek() == 'b'){
                    st.pop();
                    deletions++;
                } else {
                    st.push(ch);
                }
               
            }  else{
                    st.push(ch);
                }
            
        }
        return deletions;
    }
}
