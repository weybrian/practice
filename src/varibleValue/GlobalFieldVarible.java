package varibleValue;

public class GlobalFieldVarible {
	
	int num1 = 5;

	public static void main(String[] args) {
		
		GlobalFieldVarible varible = new GlobalFieldVarible();
		varible.changeVarible();
		System.out.println("main:"+varible.num1);
	}
	
	public void changeVarible() {
		System.out.println("changeVarible1:"+num1);
		int num1 = 10;
		System.out.println("changeVarible2:"+num1);
	}

}
