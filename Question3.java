package assignment24;

public class Question3 {

	public static void main(String[] args) {
		int nums[]= {3,2,3};
		System.out.println(findMajorityElement(nums));

	}

	private static int findMajorityElement(int[] nums) {
		int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }

        return majority;
	}

}
