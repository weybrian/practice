package varibleValue;

public class NumberType {
//想用0b轉數字失敗
	
	short num1 = 0b1011;//0b example
	char[] array = new char[10];
	int num2;
	StringBuffer stringBuffer = new StringBuffer();
	String str1;
	
	public void printNum1() {
//		System.out.println(num1);
		for (int i = 0; i < array.length; i++) {
			if (Math.random()>=0.5) {
				array[i] = '1';				
			}else {
				array[i] = '0';								
			}
			stringBuffer = stringBuffer.append(array[i]);//將亂數合成字串		
		}
		System.out.println("stringBuffer:"+stringBuffer);
		str1 = "0b"+stringBuffer.substring(0);
		System.out.println("str1:"+str1);
//		num2 = Integer.valueOf(str1);
		System.out.println(num2);
	}
	
	public static void main(String[] args) {
		
		new NumberType().printNum1();

	}

}
