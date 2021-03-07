package org.home.practise.lesson12;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChocolatesByNumbersTest {
    private static ChocolatesByNumbers chocolatesByNumbers;

    @BeforeAll
    public static void init() {
        chocolatesByNumbers = new ChocolatesByNumbers();
    }

    @ParameterizedTest
    @MethodSource("provideChoco")
    void solution(int N, int M, int expectedResult) {
        assertEquals(expectedResult, chocolatesByNumbers.solution(N, M));
    }

    private static Stream<Arguments> provideChoco() {
        return Stream.of(
                Arguments.of(10, 4, 5),
                Arguments.of(947853, 4453, 947853),
                Arguments.of(1000000000, 1, 1000000000)
        );
    }
}