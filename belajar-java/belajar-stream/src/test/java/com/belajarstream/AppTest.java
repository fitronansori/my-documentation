package com.belajarstream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testPrintsHelloWorld() {
        String expected = "Hello World!";
        App app = new App();
        String actual = app.main(new String[]{});
        assertEquals(expected, actual);
    }
}
