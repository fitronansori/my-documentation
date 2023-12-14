package com.belajarstream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {
        // membuat stream kosong
        Stream<String> emptyStream = Stream.empty();

        // membuat stream dengan satu elemen
        Stream<String> oneElementStream = Stream.of("satu");
        oneElementStream.forEach(System.out::println);

        // membuat stream dengan banyak elemen
        Stream<String> manyElementsStream = Stream.of("satu", "dua", "tiga");

        // nullable stream
        String data = null;
        Stream<String> nullableStream = Stream.ofNullable(data);
    }

    @Test
    void testCreateStreamFromArray() {
        // membuat stream dari array
        Stream<String> stream = Stream.of("satu", "dua", "tiga");

        Stream<String> streamInteger = Stream.of("1", "2", "3");

        Stream<String> streamArray = Stream.of(new String[] {"satu", "dua", "tiga"});
    }

    @Test
    void testCreateStreamFromCollection() {
        List<String> list = List.of("satu", "dua", "tiga");

        // membuat stream dari collection
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
