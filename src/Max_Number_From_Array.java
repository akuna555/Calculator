public class Max_Number_From_Array {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 78, 56, 200};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }}
                System.out.println(max);
            }
        }

