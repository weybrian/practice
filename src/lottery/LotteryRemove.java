package lottery;

import java.util.ArrayList;

/**
 * <pre>
 * 用ArrayList做樂透
 * </pre>
 * 
 * @since 2021年7月28日
 * @author 2102001
 * @version
 *          <ul>
 *          <li>2021年7月28日,2102001,new
 *          </ul>
 */
public class LotteryRemove {

    public static void main(String[] args) {
        lottery(49, 6);
    }

    public static void lottery(int maxBallNum, int selectedBallNum) {
        ArrayList<Integer> allNumberArray = new ArrayList<Integer>();
        for (int i = 0; i < maxBallNum; i++) {
            allNumberArray.add(i + 1);
            // System.out.println(allNumberArray.toString());
        }
        for (int i = 0; i < selectedBallNum; i++) {
            int j = (int) Math.round(Math.random() * allNumberArray.size());
            System.out.println(allNumberArray.get(j) + "," + allNumberArray.size());
            allNumberArray.remove(j);
        }
    }
}
