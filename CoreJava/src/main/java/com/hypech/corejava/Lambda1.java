package com.hypech.corejava;

import java.util.Arrays;
import java.util.Comparator;


public class Lambda1 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"abcde", "qwer"};
//        Arrays.sort(strArr, new LengthComparator());

        Arrays.sort(strArr, (String a, String b) -> a.length() - b.length());
        System.out.println(Arrays.toString(strArr));

    }

}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
}
