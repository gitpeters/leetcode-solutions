package problems.construct_k_palindrome_string;

/*
    Given a string s and an integer k, return true if you can use all the characters in s to construct k palindrome strings or false otherwise.

    Example 1:
    Input: s = "annabelle", k = 2
    Output: true
    Explanation: You can construct two palindromes using all characters in s.
    Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"

    Example 2:
    Input: s = "leetcode", k = 3
    Output: false
    Explanation: It is impossible to construct 3 palindromes using all the characters of s.

    Constraints:
    - 1 <= s.length <= 105
    - s consists of lowercase English letters.
    - 1 <= k <= 105
 */

public class Solution {

    public static void main(String[] args) {
        int k = 3;
        boolean result = canConstructKPalindrome("annabelle", k);
        System.out.printf("Can construct palindrome string of k = %d? %b%n", k, result);
    }

    public static boolean canConstructKPalindrome(String s, int k) {
        // count character frequencies
        int [] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        // count odd characters in frequencies
        int oddCount = 0;
        for(int count : freq){
            if(count % 2 != 0){
                oddCount++;
            }
        }
        return oddCount <= k && k <= s.length();
    }
}


