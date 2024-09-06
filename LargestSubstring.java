//Java code to find the largest substring with
//non-repeating character using Sliding Window


public class LargestSubstring {
    /*
    function to find the length of the largest substring
    with non-repeating characters using Sliding Window
     */
    static int LongestUniqueSubstr(String s){
        //if string length is 0
        if(s.length()==0)
            return 0;
        //if string length is 1
        if(s.length()==1)
            return 1;
        int maxLength = 0;
        boolean[] visited = new boolean[256];

        int left=0,right=0;
        while (right < s.length()){
            while (visited[s.charAt(right)]){
                visited[s.charAt(left)]=false;
                left++;
            }
            visited[s.charAt(right)]=true;
            /*
            the length of the current window (right - left + 1)
            is calculated and answer is updated accordingly
             */

            maxLength = Math.max(maxLength,(right - left +1));
            right++;
        }
        return maxLength;
    }


    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(LongestUniqueSubstr(s));
    }
}
