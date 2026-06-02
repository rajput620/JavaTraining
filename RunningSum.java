public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {6,4,3,2,7,8};
        System.out.println(nums[0]);
        

        for (int i = 1; i < nums.length; i++) { // updating nums
            nums[i] += nums[i - 1];
            
                 System.out.println(nums[i]);
                

            }
        }
    }
   