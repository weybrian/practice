package algorithms;

import java.util.ArrayList;

public class BubbleSort {
    private ArrayList<Integer> arrayList;

    public ArrayList<Integer> getArrayList() {
        return bubbleSort();
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Integer> bubbleSort() {
        Integer tempNum;
        for (int j = 0; j < arrayList.size() - 1; j++) {
            for (int i = 0; i < arrayList.size() - 1 - j; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    tempNum = arrayList.get(i);
                    arrayList.remove(i);
                    arrayList.add(i + 1, tempNum);
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(12);
        arrayList2.add(11);
        arrayList2.add(10);
        arrayList2.add(9);
        arrayList2.add(8);
        System.out.println(arrayList2);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.setArrayList(arrayList2);
        System.out.println(bubbleSort.getArrayList());
    }
}
