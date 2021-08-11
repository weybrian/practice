package algorithms;

import java.util.ArrayList;

public class Algorithms {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(8);
        arrayList2.add(9);
        arrayList2.add(7);
        arrayList2.add(10);
        arrayList2.add(6);
        Algorithms algorithms = new Algorithms();
        System.out.println(algorithms.insertionSort(arrayList2));
    }

    /*
     * 選擇排序
     */
    public ArrayList<Integer> selectionSort(ArrayList<Integer> arrayList) {
        for (int j = 0; j < arrayList.size() - 1; j++) {
            Integer minNum = arrayList.get(j + 1);
            Integer minNumIndex = j + 1;
            // 先取後面剩餘數字的最小值
            for (int i = 2 + j; i < arrayList.size(); i++) {
                if (minNum > arrayList.get(i)) {
                    minNum = arrayList.get(i);
                    minNumIndex = i;
                }
            }
            System.out.println(minNum);
            // 後面數字的最小值與前面的數字比較，看是否交換
            if (minNum < arrayList.get(j)) {
                arrayList.set(minNumIndex, arrayList.get(j));
                arrayList.set(j, minNum);
            }
        }
        return arrayList;
    }

    /*
     * 插入排序
     */
    public ArrayList<Integer> insertionSort(ArrayList<Integer> arrayList) {
        ArrayList<Integer> orderedArrayList = new ArrayList<>();
        Integer tempNum = 0;
        Integer arrayListSize = arrayList.size();
        // 從原arrayList取第一個數
        for (int j = 0; j < arrayListSize; j++) {
            if (0 < arrayList.size()) {
                tempNum = arrayList.get(0);
                arrayList.remove(0);
            }
            // 拿到已排序的陣列，從最後面開始比大小
            if (0 == orderedArrayList.size()) {
                orderedArrayList.add(tempNum);
            } else {
                for (int i = orderedArrayList.size() - 1; i >= 0; i--) {
                    if (tempNum > orderedArrayList.get(i)) {
                        if (!orderedArrayList.contains(tempNum)) {
                            orderedArrayList.add(tempNum);
                        }
                    }
                }
                if (!orderedArrayList.contains(tempNum)) {
                    orderedArrayList.add(0, tempNum);
                }
            }
        }
        return orderedArrayList;
    }

}
