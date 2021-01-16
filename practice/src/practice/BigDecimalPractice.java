package practice;

import java.math.BigDecimal;

public class BigDecimalPractice {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal(10);
		BigDecimal b2 = new BigDecimal("10");
		BigDecimal b3 = new BigDecimal("10.0");
		BigDecimal b4 = null;//初始值宣告為null
		BigDecimal b5 = new BigDecimal(3);
		
		//比較
		System.out.println(b1 == b2);//false，不能與String用+相連
		System.out.println(b2 == b3);//false
		System.out.println(""+b1.equals(b2));//true
		System.out.println(""+b2.equals(b3));//false
		System.out.println(""+b1.compareTo(b2));//0，小於為-1，大於為1
		System.out.println(""+b2.compareTo(b3));//0
		System.out.println(""+b1.compareTo(b3));//0
		
		//計算
		System.out.println(""+b5.add(b2));//13
		System.out.println(""+b5.subtract(b2));//-7
		System.out.println(""+b5.multiply(b2));//30
		System.out.println(""+b5.divide(b2));//0.3
//		System.out.println(""+b2.divide(b5));//會報錯 java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.

		b5.add(b2);//會產生新物件
		System.out.println(""+b5);//3
		b5 = b5.add(b2);//會改變b5
		System.out.println(""+b5);//13
	}

}
