package org.yuri.minmaxsum;

import java.util.*;
import java.util.function.*;

public class Method2 {

    public static void miniMaxSum(List<Integer> arr) {
        BinaryOperator<Long> accumulator = Long::sum;

        Optional<Long> maxSum = arr.stream().sorted().map(Integer::longValue)
                .skip(1).reduce(accumulator);

        Optional<Long> minSum = arr.stream().sorted().map(Integer::longValue)
                .limit(4).reduce(accumulator);

        if (maxSum.isEmpty() || minSum.isEmpty()) return;

        System.out.println(minSum.get() + " " + maxSum.get());
    }
}
