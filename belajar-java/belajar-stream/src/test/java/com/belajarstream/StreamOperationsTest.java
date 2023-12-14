package com.belajarstream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamOperationsTest {
    @Test
    void testMapStream() {
        List <String> list = List.of("Java", "Kotlin", "Python", "C++", "C#");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
