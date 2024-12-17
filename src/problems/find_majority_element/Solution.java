package problems.find_majority_element;

public class Solution {
    /*
     * - Question: Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

     * - Examples:

        * 1:
        Input: nums = [3,2,3]
        Output: 3

        * 2:
        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
     * */

    public static void main(String[] args) {
        int majorityElement = majorityElement(new int[]{2,2,1,1,1,2,2});
        System.out.println("Majority element: " + majorityElement);
    }

    public static int majorityElement(int[] nums) {
        int candidate =0, count=0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}