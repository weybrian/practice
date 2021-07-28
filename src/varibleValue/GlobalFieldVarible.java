package varibleValue;

/**
 * <pre>
 * 全域變數
 * </pre>
 * 
 * @since 2021年7月28日
 * @author 2102001
 * @version
 *          <ul>
 *          <li>2021年7月28日,2102001,new
 *          </ul>
 */
public class GlobalFieldVarible {

    int num1 = 5;

    public static void main(String[] args) {

        GlobalFieldVarible varible = new GlobalFieldVarible();
        varible.changeVarible();
        System.out.println("main:" + varible.num1);
    }

    public void changeVarible() {
        System.out.println("changeVarible1:" + num1);
        int num1 = 10;
        System.out.println("changeVarible2:" + num1);
    }

}
