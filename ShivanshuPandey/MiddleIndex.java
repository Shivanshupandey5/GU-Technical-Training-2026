public class MiddleIndex{
    
        public int findMiddleIndex(int[] nums) {
            int totalSum = 0;
            for (int num : nums) {
                totalSum += num;
            }
    
            int leftSum = 0;
    
            for (int i = 0; i < nums.length; i++) {
                int rightSum = totalSum - leftSum - nums[i];
    
                if (leftSum == rightSum) {
                    return i;
                }
    
                leftSum += nums[i];
            }
    
            return -1;
        }
    
        public static void main(String[] args) {
            MiddleIndex solution = new MiddleIndex();
    
            int[] nums1 = {2, 3, -1, 8, 4};
            int[] nums2 = {1, -1, 4};
            int[] nums3 = {2, 5};
    
            System.out.println(solution.findMiddleIndex(nums1)); // Output: 3
            System.out.println(solution.findMiddleIndex(nums2)); // Output: 2
            System.out.println(solution.findMiddleIndex(nums3)); // Output: -1
        }
}
    

