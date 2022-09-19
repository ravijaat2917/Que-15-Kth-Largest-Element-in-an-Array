class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int length = nums.length-1;
        for( int i = 1 ; i <= k  ; i++){
            result = nums[length];
            length--;
        }
        return result;
    }
}