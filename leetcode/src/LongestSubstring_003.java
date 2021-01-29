public class LongestSubstring_003 {

    class Solution {

        // 无重复的最长字串的问题，需要动态规划？
        public int lengthOfLongestSubstring(String s) {
            int max = 1;
            int startIndex = 0;
            for(int i = 1; i < s.length(); i++){
                String temp =  new String(new char[]{s.charAt(i)});
                String temp2 = s.substring(startIndex,i);
                if (!temp2.contains(temp)){
                    max = (i - startIndex + 1) > max ? (i - startIndex + 1):max;
                }else{
                    max = i - s.substring(0,i).lastIndexOf(temp) -1 >max ? i - s.substring(0,i).lastIndexOf(temp) -1 :max;
                    startIndex = s.lastIndexOf(temp) + 1;
                }
            }

            return s.length() == 0 ? 0: max;
        }
    }

    public static void main(String[] args) {

        System.out.println(new LongestSubstring_003().new Solution().lengthOfLongestSubstring("abcabcbb"));
    }
}
