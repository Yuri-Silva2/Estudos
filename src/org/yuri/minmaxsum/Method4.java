package org.yuri.minmaxsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Method4 {

    public static void minMaxSum(List<Integer> arr) {
        Collections.sort(arr);

        long x = 0, y = 0;

        for (int i = 0; i < 4; i++) {
            x += arr.get(i);
        }

        for (int i = 1; i < 5; i++) {
            y += arr.get(i);
        }

        System.out.println(x + " " + y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        minMaxSum(arr);

        bufferedReader.close();
    }
}
