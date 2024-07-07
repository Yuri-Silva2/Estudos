package org.yuri.minmaxsum;

import java.util.Arrays;
import java.util.List;

public class Method1 {

    static long sumTest(long... v) {
        return v[0] + v[1] + v[2] + v[3];
    }

    public static void miniMaxSum(List<Integer> arr) {
        long test1, test2, test3, test4, test5;

        /*
                1 2 3 4
                0 2 3 4
                0 1 3 4
                0 1 2 4
                0 1 2 3
         */

        test1 = sumTest(arr.get(1), arr.get(2), arr.get(3), arr.get(4));
        test2 = sumTest(arr.get(0), arr.get(2), arr.get(3), arr.get(4));
        test3 = sumTest(arr.get(0), arr.get(1), arr.get(3), arr.get(4));
        test4 = sumTest(arr.get(0), arr.get(1), arr.get(2), arr.get(4));
        test5 = sumTest(arr.get(0), arr.get(1), arr.get(2), arr.get(3));

        long[] nArr = {test1, test2, test3, test4, test5};

        List<Long> a = Arrays.stream(nArr)
                .boxed().sorted().toList();

        System.out.println(a.getFirst() + " " + a.getLast());
    }
}
