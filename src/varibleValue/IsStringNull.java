package varibleValue;

public class IsStringNull {
	
	static String name1 = "Brian";
	static String name2 = "";
	static String name3 = null;

	public static void main(String[] args) {
		if (!"".equals(name1)) {
			System.out.println("name1 is Brian.");//name1 is Brian.
		}
		if (!"".equals(name2)) {
			System.out.println("name2 is empty.");
		}
		if (!"".equals(name3)) {
			System.out.println("name3 is null.");//name3 is null.
		}

		if (null != name1 && !"".equals(name1)) {
			System.out.println("name1 is Brian.");//name1 is Brian.
		}
		if (null != name2 && !"".equals(name2)) {
			System.out.println("name2 is empty.");
		}
		if (null != name3 && !"".equals(name3)) {
			System.out.println("name3 is null.");
		}

		if (name1 != null && !name1.equals("")) {
			System.out.println("name1 is Brian.");//name1 is Brian.
		}
		if (name2 != null && !name2.equals("")) {
			System.out.println("name2 is empty.");
		}
		if (name3 != null && !name3.equals("")) {
			System.out.println("name3 is null.");
		}
	}

}
