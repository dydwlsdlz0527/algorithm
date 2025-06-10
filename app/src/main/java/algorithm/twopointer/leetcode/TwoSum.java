package algorithm.twopointer.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * ------------------------------------------------------------
 *  파일명  : TwoSum.java
 *  설명 : 정수가 저장된 배열 nums이 주어졌을 때, nums의 원소 중 두 숫자를 더해서 target이 될 수 있으면 True, 불가능하면 False를 반환.
 *         같은 원소는 두 번 사용할 수 없다.
 *         https://leetcode.com/problems/two-sum/description/
 *  작성자  : 김용진
 *  작성일  : 2025-06-08
 *  수정이력   :
 *   - 2025-06-08 김용진 최초 생성
 * ------------------------------------------------------------
 */
public class TwoSum {
    
    public boolean twoSum(int[] nums, int target){
        // 2개 수의 인덱스를 담을 배열 선언.
        // int[] result = new int[2];

        // 1. 완전 탐색 O(n^2)
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean twoSum2(int[] nums, int target){

        Set<Integer> set = new HashSet<>();
        // O(n)
        for(int i : nums){
            set.add(i);
        }
        // O(n)
        for(int j=0;j<nums.length;j++){
            if(set.contains(target-nums[j])){
                return true;
            }
        }
        return false;
    }

    public boolean twoSum3(int[] nums, int target){

        return false;
    }
}
