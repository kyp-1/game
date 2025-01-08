package d0103;

public class Variable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		// 배열
		
		int[] nums = new int[5];
		
		System.out.println(nums[0]);
		for(int i=0;i<5;i++) {
			nums[i] = i+1;
		}
		for(int i=0;i<5;i++) {
		System.out.println(nums[i]);
		}
	}
}
