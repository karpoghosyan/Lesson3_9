package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers1.add(8);
        numbers1.add(10);
        numbers1.add(98);
        numbers1.add(55);
        numbers1.add(99);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        Collections.copy(numbers1, numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers1.get(i) + "  ");
        }
    }
}
