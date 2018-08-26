import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Compare 2 lists. The first one contains gauge keys and another contains keys in DB.
     * Return all keys which present in one list and not exist on another list.
     * @param list1 List of gauge keys
     * @param list2 List of keys in DB
     * @return list of keys exist only in one of input lists
     */
    List<String> compareTwoLists(List<String> list1, List<String> list2) {
        List<String> nonExistKeys = new ArrayList<>();
        ArrayList<String> tempList1 = new ArrayList<>(list1);

        for (String element : list2) {
            if (!tempList1.contains(element)) {
                // element from list 2 is not in list 1 add it into a list of non-exist keys
                nonExistKeys.add(element);
            }
            else {
                // element exist both in list 1 and list 2, remove it from hashList
                //   to be able to compare if to the same elements exist in one list
                //   and the second should have both of them
                tempList1.remove(element);
            }
        }

        // add all keys in list1 non-exit in list2
        nonExistKeys.addAll(tempList1);

        return nonExistKeys;
    }
}
