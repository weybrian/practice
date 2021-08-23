package algorithms;

import java.util.ArrayList;

public class SearchMethod extends Algorithms {

    private String searchMethod;
    private Integer searchNum;

    public SearchMethod() {
        super();
    }

    public SearchMethod(String searchMethod, Integer searchNum) {
        super();
        this.searchMethod = searchMethod;
        this.searchNum = searchNum;
    }

    public String getSearchMethod() {
        return searchMethod;
    }

    public void setSearchMethod(String searchMethod) {
        this.searchMethod = searchMethod;
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public ArrayList<Integer> searchResult() {
        switch (searchMethod) {
        case "binarySearch":
            return binarySearch();
        default:
            System.out.println("You didn't type any sort method.");
            return null;
        }
    }

    /*
     * 二元搜尋法
     */
    public ArrayList<Integer> binarySearch() {
        ArrayList<Integer> arrayList = super.getArrayList();
        ArrayList<Integer> searchNumIndexList = new ArrayList<Integer>();
        Integer startIndex = 0, endIndex, searchNumIndex = 0;
        endIndex = arrayList.size() - 1;
        for (int i = 0; i < arrayList.size(); i++) {
            // 決定searchNumIndex
            if (0 == (endIndex - startIndex) % 2) {
                searchNumIndex = (startIndex + endIndex) / 2;
            } else {
                searchNumIndex = (startIndex + endIndex + 1) / 2;
            }
            // 比對searchNum是否跟searchNumIndex的數相同
            if (searchNum == arrayList.get(searchNumIndex)) {
                searchNumIndexList.add(searchNumIndex + 1);
                break;
            } else if (searchNum > arrayList.get(searchNumIndex)) {
                startIndex = searchNumIndex;
            } else {
                endIndex = searchNumIndex;
            }
        }
        // 重複searchNum，Index裝到list
        if (searchNum == arrayList.get(searchNumIndex + 1)) {
            for (int i = 1; i < endIndex - searchNumIndex; i++) {
                if (searchNum == arrayList.get(searchNumIndex + i)) {
                    searchNumIndexList.add(searchNumIndex + 1 + i);
                }
            }
        }
        if (searchNum == arrayList.get(searchNumIndex - 1)) {
            for (int i = 1; i < searchNumIndex - startIndex; i++) {
                if (searchNum == arrayList.get(searchNumIndex - i)) {
                    searchNumIndexList.add(0,searchNumIndex + 1 - i);
                }
            }
        }
        return searchNumIndexList;
    }
}
