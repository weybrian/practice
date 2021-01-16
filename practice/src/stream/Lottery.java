package stream;

import java.util.ArrayList;
import java.util.List;

public class Lottery {

	static int length = 49;
	static int num = 7;

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// 產生出1到length的陣列
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < length + 1; i++) {
			list.add(i);
		}
		System.out.println(list.toString());

		// 方法一：產生出號碼，不與陣列數字重複
		int count = 0;
		while (count < 10000) {//測10000次確定沒問題，不會出現bad
			int[] array = new int[num];//宣告樂透開獎陣列長度
//			for (int j = 0; j < num; j++) {
//				Boolean flag = true;
//				int random = (int) (Math.random() * 49) + 1;
//				for (int i = 0; i < num; i++) {
//					if (array[i] == random) {
//						flag = false;//若新開獎號碼與已開獎號碼重複，則倒旗
//						break;
//					}
//				}
//				if (flag == true) {
//					array[j] = random;
//				}
//				else {
//					j--;//如果遇到重複的數字，當下的j會重新執行
//				}
//			}
			
			//方法一改進，有比較快
			for (int j = 0; j < num; j++) {
				array[j] = (int) (Math.random() * 49) + 1;
				for (int i = 0; i < j; i++) {
					if (array[i] == array[j]) {
						j--;
						break;
					}
				}
			}
			
//			for (int i : array) {
//				System.out.println(i);
//			}
			int c = 0;
			for (int a = 0 + c; a < num; a++) {
				for (int b = 1 + c; b < num; b++) {
					if (array[a] == array[b]) {
						System.out.println("bad");//測陣列內數字無重複，否則出現bad
					}
				}
				c++;
			}
			count++;
		}
		System.out.println("end");
		System.out.println(System.currentTimeMillis()-startTime);
		
		//方法二：可將選到的數字替換到陣列前方http://gn00466269.blogspot.com/2015/06/java_30.html
	}

}
