package org.yuri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusMinus {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Arrays.stream(bufferedReader.readLine()
                        .replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        plusMinus(arr);

        bufferedReader.close();
    }

    static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;

        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);
    }
}
