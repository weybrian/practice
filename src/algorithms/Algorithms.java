package algorithms;

import java.util.ArrayList;

public class Algorithms {

    public static void main(String[] args) {
        // 測試排序
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.toIntExact((long) Math.floor(Math.random() * 10 + 1)));
        }
        Integer searchNum = 7;
        arrayList.add(searchNum);
        System.out.println("Before sorting：" + arrayList);
        Algorithms algorithms = new Algorithms();
        System.out.println(" After sorting：" + algorithms.selectionSort(arrayList));
        System.out.println("Index of 5：" + algorithms.binarySearch(arrayList, searchNum));
    }

    /*
     * 選擇排序
     */
    public ArrayList<Integer> selectionSort(ArrayList<Integer> arrayList) {// 第一個數為衛冕者，第二個數以後為挑戰者
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
            }
        }
        return arrayList;
    }

    /*
     * 插入排序
     */
    public ArrayList<Integer> insertionSort(ArrayList<Integer> arrayList) {
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
            // 拿tempArrayList取第一個數到已排序的陣列，從最後面往前開始比大小
            if (0 == orderedArrayList.size()) {
                orderedArrayList.add(tempNum);
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
            }
        }
        return orderedArrayList;
    }

    /*
     * 二元搜尋法
     */
    public Integer binarySearch(ArrayList<Integer> arrayList, Integer searchNum) {
        Integer startIndex = 0, endIndex, searchNumIndex = 0;
        endIndex = arrayList.size() - 1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (0 == (endIndex - startIndex) % 2) {
                searchNumIndex = (startIndex + endIndex) / 2;
            } else {
                searchNumIndex = (startIndex + endIndex + 1) / 2;
            }
            if (searchNum == arrayList.get(searchNumIndex)) {
                return searchNumIndex + 1;
            } else if (searchNum > arrayList.get(searchNumIndex)) {
                startIndex = searchNumIndex;
            } else {
                endIndex = searchNumIndex;
            }
        }
        return searchNumIndex;
    }
}
