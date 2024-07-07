package org.yuri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    static String timeConversion(String s) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssaa");

        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time;

        time = dateFormat.parse(s);

        return format.format(time);
    }

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result = timeConversion(br.readLine());

        System.out.println(result);
        br.close();
    }
}
