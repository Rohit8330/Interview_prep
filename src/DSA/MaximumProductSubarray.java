public class MaximumProductSubarray {
    public static int maxProductSubArray(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int prod = 1;
            for(int j = i; j < n; j++) {
                prod *= nums[j];
                maxProd = Math.max(maxProd, prod);
            }
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,-3,0,-4,-5};
        int answer = maxProductSubArray(nums);
        System.out.print("The maximum product sub-array is: "+answer);
    }
}
