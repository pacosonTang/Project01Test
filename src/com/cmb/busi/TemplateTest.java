package com.cmb.busi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class TemplateTest {

    public static void main(String[] args) {
        System.out.println("11");

        int a = 1;
        System.out.println("a = " + a);
        System.out.println("args = " + Arrays.deepToString(args));

        System.out.println(a);



        String[] arr = new String[]{"1", "2", "3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        for (String s : arr) {

        }

        List<String> list = new ArrayList<>();
        for (String s : list) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        for (String s : list) {
        }

        if (list == null) {

        }

        if (list == null) {

        }

        if (list != null) {

        }
        if (list != null) {

        }

        if (list != null) {

        }
        if (list == null) {

        }

    }
}
