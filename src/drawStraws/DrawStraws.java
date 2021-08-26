package drawStraws;

import java.util.LinkedList;

/**
 * <pre>
 * 抽籤配對
 * </pre>
 * 
 * @since 2021年8月26日
 * @author 2102001
 * @version
 *          <ul>
 *          <li>2021年8月26日,2102001,new
 *          </ul>
 */
public class DrawStraws {

    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> memberList = new LinkedList<>();
        memberList.add("兆成");
        memberList.add("琬婷");
        memberList.add("旻家");
        memberList.add("怡佳");
        LinkedList<String> orderOfDrawStraws = orderOfDrawStraws(memberList);// 第一步：抽抽籤順序
        System.out.println("先抽抽籤順序");
        for (String giver : orderOfDrawStraws) {
            Thread.sleep(1000);
            System.out.println(giver);
        }
        System.out.println();
        Thread.sleep(1000);
        LinkedList<String> personOfExchange = null;
        while (null == personOfExchange) {
            personOfExchange = personOfExchange(orderOfDrawStraws, memberList);// 第二步：抽交換美食對象
        }
        System.out.println("再抽交換美食對象");
        Thread.sleep(1000);
        System.out.println("點餐者 -> 接收者");
        for (String giverAndReceiver : personOfExchange) {
            Thread.sleep(1000);
            System.out.println(giverAndReceiver);
        }
    }

    /*
     * 抽籤順序
     */
    public static LinkedList<String> orderOfDrawStraws(LinkedList<String> memberList) {
        @SuppressWarnings("unchecked")
        LinkedList<String> memberListClone = (LinkedList<String>) memberList.clone();
        LinkedList<String> orderOfDrawStraws = new LinkedList<>();
        int index = 0;
        while (memberListClone.size() > 0) {
            index = (int) Math.floor(Math.random() * memberListClone.size());
            orderOfDrawStraws.add(memberListClone.get(index));
            memberListClone.remove(index);
        }
        return orderOfDrawStraws;
    }

    /*
     * 抽交換美食對象
     */
    public static LinkedList<String> personOfExchange(LinkedList<String> orderOfDrawStraws, LinkedList<String> memberList) {
        @SuppressWarnings("unchecked")
        LinkedList<String> memberListClone = (LinkedList<String>) memberList.clone();
        LinkedList<String> personOfExchange = new LinkedList<>();
        int index = 0, i = 0;
        boolean deleteFlag = false;
        while (memberListClone.size() > 1) {
            deleteFlag = false;
            String temp = orderOfDrawStraws.get(i);// 先暫存orderOfMembers第一位
            for (int j = 0; j < memberListClone.size(); j++) {// 移除還沒被抽到的receiver內，與giver重複的成員
                String member = memberListClone.get(j);
                if (member.equals(temp)) {
                    memberListClone.remove(j);
                    deleteFlag = true;
                    break;
                }
            }
            index = (int) Math.floor(Math.random() * memberListClone.size());
            personOfExchange.add("　" + orderOfDrawStraws.get(i++) + " -> " + memberListClone.get(index));
            memberListClone.remove(index);
            if (deleteFlag) {
                memberListClone.add(temp);// 有移除，才需加回
            }
        }
        if (!orderOfDrawStraws.get(i).equals(memberListClone.get(0))) {// 最後一個giver與receiver不同時，才會回傳list
            personOfExchange.add("　" + orderOfDrawStraws.get(i) + " -> " + memberListClone.get(0));
            return personOfExchange;
        }
        return null;
    }
}
