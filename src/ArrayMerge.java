import java.util.ArrayList;

import static java.lang.Math.min;

class ArrayMerge {

    static ArrayList MyMerge(ArrayList list1, ArrayList list2) {
        ArrayList<Integer> merge_list = new ArrayList<>();
        int min_size = min(list1.size(), list2.size());
        for (int index = 0; index < min_size; index++) {
            merge_list.add((Integer) list1.get(index));
            merge_list.add((Integer) list2.get(index));
        }
        if (list1.size() < list2.size()) {
            for (int index = min_size; index < list2.size(); index++) {
                merge_list.add((Integer) list2.get(index));
            }
        } else {
            for (int index = min_size; index < list1.size(); index++) {
                merge_list.add((Integer) list1.get(index));
            }
        }
        return merge_list;
    }

}
