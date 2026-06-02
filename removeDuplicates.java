class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int count = removeDuplicates(nums);
        System.out.println(count);
    }
    public static int removeDuplicates(int[] nums) {

        int count =1;
        for(int i=1; i<nums.length;i++) {
            if(nums[i] != nums[i-1]){
                nums[count]= nums[i];
                count++;
            }
        }

        return count;
    }
}



