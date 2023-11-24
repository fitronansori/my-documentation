package com.application;

import com.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Hello", 100);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
