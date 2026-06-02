public class ConcatenationArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[i % n];
            System.out.println(ans[i]);
        }
    }
}