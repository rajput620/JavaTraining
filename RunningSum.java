public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {6,4,3,2,7,8};

        for (int i = 1; i < nums.length; i++) { // updating nums
            nums[i] += nums[i - 1];
            System.out.println(nums[i]);
        }
        // for(int i=0; i<nums.length; i++){ // printing nums
        //     System.out.println(nums[i]);
        // }
        // System.out.println("==========================");
        // for(int num : nums)
        //     {
        //         System.out.println("num: ");
        //         System.out.println(num);
        //     }

    
    }
}