package easy;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		int[] nums1 = new int[5];
		System.out.println("배열로 선언할 숫자 5개를 입력하세요.");
		Scanner sc1 = new Scanner(System.in);
		
		for(int i = 0; i<nums1.length; i++) {
			nums1[i] =sc1.nextInt();
		}
		System.out.println(Arrays.toString(nums1));
		
		int target = 0;
		System.out.println("target 숫자를 입력하세요.");
		Scanner sc2 = new Scanner(System.in);
		target = sc2.nextInt();
		
		Solution sol = new Solution();
		sol.twoSum(nums1, target);
	
		
	}

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	
    	int[] result2 = null;
    	
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i]+nums[i+1]==target) {
    			int[] result1 = {i,i+1};
    			result2 = result1;
    		}
    	}
    	return result2;
    }
}
