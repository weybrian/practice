package array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		
		int[] re = reverse(nums, nums.length);
		for (int i : re) {
			System.out.println(i);
		}
	}

	public static int[] reverse(int[] arrays, int length) {
		int[] intArrays = new int[length];
//		int num = length-1;
//		for (int a : arrays) {
//			intArrays[num] = a;
//			num--;
//		}
		
		for (int i = 0; i < intArrays.length; i++) {
			intArrays[i] = arrays[length-1];
			length--;
		}
		
		return intArrays;
	}
}
