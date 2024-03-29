package com.belajarjunit;

import com.belajarjunit.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

@Extensions({
        @ExtendWith(RandomParameterResolver.class),
})
public class RandomCalculatorTest {

        private Calculator calculator = new Calculator();

        @Test
        void testRandom(Random random) {
            var a = random.nextInt();
            var b = random.nextInt();
            var result = calculator.add(a, b);
            var expected = a + b;

            Assertions.assertEquals(expected, result);
        }
}
