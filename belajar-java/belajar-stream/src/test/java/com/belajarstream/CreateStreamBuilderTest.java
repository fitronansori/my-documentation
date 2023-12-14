package com.belajarstream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreteStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Java"); // accept() untuk menambahkan data ke stream
        builder.add("Kotlin"); // add() untuk menambahkan data ke stream

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimple() {
        Stream<String> stream = Stream.<String>builder()
                .add("Java")
                .add("Kotlin")
                .add("Python")
                .build();
        stream.forEach(System.out::println);
    }
}
