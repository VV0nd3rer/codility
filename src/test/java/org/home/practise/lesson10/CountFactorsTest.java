package org.home.practise.lesson10;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountFactorsTest {
    private static CountFactors countFactors;

    @BeforeAll
    private static void init() {
        countFactors = new CountFactors();
    }

    @ParameterizedTest
    @MethodSource("provideValues")
    void solution(int N, int expectedResult) {
        assertEquals(expectedResult, countFactors.solution(N));
    }

    private static Stream<Arguments> provideValues() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(24, 8),
                Arguments.of(30, 8),
                Arguments.of(36, 9),
                Arguments.of(48, 10),
                Arguments.of(101, 2),
                Arguments.of(1234, 4),
                Arguments.of(2147483647, 2)
        );
    }
}