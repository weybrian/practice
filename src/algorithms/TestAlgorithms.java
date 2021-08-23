package algorithms;

import java.util.ArrayList;

public class TestAlgorithms {

    public static void main(String[] args) {
        // 測試排序
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Math.toIntExact((long) Math.floor(Math.random() * 10 + 1)));
            // arrayList.add(i);
        }
        Integer searchNum = 5;
        arrayList.add(searchNum);
        arrayList.add(searchNum);
        arrayList.add(searchNum);
        System.out.println("Before sorting：" + arrayList);
        SortMethod sortMethod = new SortMethod();
        sortMethod.setArrayList(arrayList);
        sortMethod.setSortMethod("selectionSort");//bubbleSort, selectionSort,insertionSort
        System.out.println("After "+sortMethod.getSortMethod()+" sorting：" + sortMethod.sortResult());
        SearchMethod searchMethod = new SearchMethod("binarySearch", searchNum);//binarySearch
        searchMethod.setArrayList(sortMethod.sortResult());
        System.out.println("Index of "+searchMethod.getSearchNum()+" locate at：" + searchMethod.searchResult());
    }

}
