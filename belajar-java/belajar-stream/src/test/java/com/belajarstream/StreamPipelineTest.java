package com.belajarstream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamPipelineTest {
    @Test
    void testStreamPipeline() {
        List<String> list = List.of("Java", "Kotlin", "Python", "C++", "C#", "Go", "JavaScript");

        list.stream()
                .map(String::toUpperCase)
                .filter(name -> name.length() > 4)
                .sorted()
                .forEach(System.out::println);
    }
}
