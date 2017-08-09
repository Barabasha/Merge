import com.google.common.collect.Lists;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list1 = Lists.newArrayList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        ArrayList list2 = Lists.newArrayList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        System.out.println(ArrayMerge.MyMerge(list1, list2));
    }
}
