package algorithms;

import java.util.ArrayList;

public class SortMethod extends Algorithms{

    private String sortMethod;

    public String getSortMethod() {
        return sortMethod;
    }
    public void setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
    }

    public ArrayList<Integer> sortResult() {
        if (null != sortMethod) {
            switch (sortMethod) {
            case "bubbleSort":
                return bubbleSort();
            case "selectionSort":
                return selectionSort();
            case "insertionSort":
                return insertionSort();
            default:
                System.out.println("You didn't type correct method.");
                return null;
            }
        } else {
            System.out.println("You didn't type any sort method.");
            return null;
        }
    }

    /*
     * 冒泡排序
     */
    public ArrayList<Integer> bubbleSort() {
        ArrayList<Integer> arrayList = super.getArrayList();
        Integer tempNum;
        for (int j = 0; j < arrayList.size() - 1; j++) {
            for (int i = 0; i < arrayList.size() - 1 - j; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    tempNum = arrayList.get(i);
                    arrayList.remove(i);
                    arrayList.add(i + 1, tempNum);
                    System.out.println(arrayList);
                }
            }
        }
        return arrayList;
    }

    /*
     * 選擇排序
     */
    public ArrayList<Integer> selectionSort() {// 第一個數為衛冕者，第二個數以後為挑戰者
        ArrayList<Integer> arrayList = super.getArrayList();
        for (int j = 0; j < arrayList.size() - 1; j++) {
            Integer minNum = arrayList.get(j + 1);// 取挑戰者的第一個數為預設挑戰者最小值
            Integer minNumIndex = j + 1;
            // 先取挑戰者數字的最小值
            for (int i = 2 + j; i < arrayList.size(); i++) {
                if (minNum > arrayList.get(i)) {
                    minNum = arrayList.get(i);
                    minNumIndex = i;
                }
            }
            // 挑戰者的最小值與衛冕者的數字比較，看是否交換
            if (minNum < arrayList.get(j)) {
                arrayList.set(minNumIndex, arrayList.get(j));
                arrayList.set(j, minNum);
                System.out.println(arrayList);
            }
        }
        return arrayList;
    }

    /*
     * 插入排序
     */
    public ArrayList<Integer> insertionSort() {
        ArrayList<Integer> arrayList = super.getArrayList();
        ArrayList<Integer> orderedArrayList = new ArrayList<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer> tempArrayList = (ArrayList<Integer>) arrayList.clone();
        Integer tempNum = 0;
        Integer tempArrayListSize = tempArrayList.size();
        Boolean addFlag = false;
        for (int j = 0; j < tempArrayListSize; j++) {
            addFlag = false;
            // 從tempArrayList取第一個數
            if (0 < tempArrayList.size()) {
                tempNum = tempArrayList.get(0);
                tempArrayList.remove(0);
            }
            System.out.print(tempArrayList);
            // 拿tempArrayList取第一個數到已排序的陣列，從最後面往前開始比大小
            if (0 == orderedArrayList.size()) {
                orderedArrayList.add(tempNum);
                System.out.println(orderedArrayList);
            } else {
                for (int i = orderedArrayList.size() - 1; i >= 0; i--) {
                    if (false == addFlag && tempNum >= orderedArrayList.get(i)) {
                        orderedArrayList.add(i + 1, tempNum);
                        addFlag = true;
                    }
                }
                if (!orderedArrayList.contains(tempNum)) {
                    orderedArrayList.add(0, tempNum);
                }
                System.out.println(orderedArrayList);
            }
        }
        return orderedArrayList;
    }
}
