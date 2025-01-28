public class LTC006 {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
    
            int k = 1;
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
    
            return k;
        }
    
        public static void main(String[] args) {
            LTC006 solution = new LTC006();
            int[] nums = {1, 1, 2, 3, 3, 4};
            int newLength = solution.removeDuplicates(nums);
            
            System.out.println("New length: " + newLength);
            System.out.print("Modified array: ");
            for (int i = 0; i < newLength; i++) {
                System.out.print(nums[i] + " ");
        }
    }
}

