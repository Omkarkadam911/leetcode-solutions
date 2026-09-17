// Problem: #14 - Longest Common Prefix
// Difficulty: Easy
// Link: https://leetcode.com/problems/longest-common-prefix/
// Submission: https://leetcode.com/problems/longest-common-prefix/submissions/2144784454/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int len = strs.length;
        String temp = "";
        int shortest = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[shortest].length() > strs[i].length()) {
                shortest = i;
            }
        }

        for (int i = 1; i <= strs[shortest].length(); i++) {
            temp = strs[shortest].substring(0, i);
            for (int j = 0; j < len; j++) {
                if (!temp.equals(strs[j].substring(0, i))) {
                    return strs[shortest].substring(0, i - 1);
                }
            }
        }
        return temp;
    }
}
