package org.yuri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BreakingTheRecords {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Respective values of scores
        List<Integer> scores = Stream.of(reader.readLine().replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        //Final values
        List<Integer> result = Result.breakingRecords(scores);

        System.out.println(result);

        reader.close();
    }

    static class Result {

        /*                           Count
            Game  Score  Min  Max   Min  Max
              0     10   10   10     0    0
              1     5    5    10     1    0
              2     20   5    20     0    1
              3     20   5    20     0    0
              4     4    4    20     1    0
              5     5    4    20     0    0
              6     2    2    20     1    0
              7     25   2    25     0    1
              8     1    1    25     1    0
         */

        public static List<Integer> breakingRecords(List<Integer> scores) {
            int min = scores.getFirst(), max = scores.getFirst();
            int cMin = 0, cMax = 0;

            for (int i = 1; i < scores.size(); i++) {
                if (scores.get(i) < min) {
                    min = scores.get(i);
                    cMax++;

                } else if (scores.get(i) > max) {
                    max = scores.get(i);
                    cMin++;
                }
            }

            return Arrays.asList(cMin, cMax);
        }
    }
}
