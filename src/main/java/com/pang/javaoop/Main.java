package com.pang.javaoop;

import com.pang.javaoop.logic.BubbleSort;
import com.pang.javaoop.logic.JavaSort;
import com.pang.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
