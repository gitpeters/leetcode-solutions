package problems.counting_words_with_prefix;
/*
     You are given an array of strings words and a string pref.

    Return the number of strings in words that contain pref as a prefix.

    A prefix of a string s is any leading contiguous substring of s.

    Example 1:

    Input: words = ["pay","attention","practice","attend"], pref = "at"
    Output: 2
    Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".

    Constraints:
    1 <= words.length <= 100
    1 <= words[i].length, pref.length <= 100
    words[i] and pref consist of lowercase English letters.
     * */
public class Solution {

    public static void main(String[] args) {
        String[] data = new String[]{"pay","attention","practice","attend"};
        int result = prefixCount(data, "at");
        System.out.println(result);
    }

    public static int prefixCount(String[] words, String pref) {
        int counter = 0;
        for(String word : words){
            if(word.startsWith(pref)){
                counter++;
            }
        }
        return counter;
    }
}
