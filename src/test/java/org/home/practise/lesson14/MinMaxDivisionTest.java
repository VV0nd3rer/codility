package org.home.practise.lesson14;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MinMaxDivisionTest {
    private static MinMaxDivision minMaxDivision;

    @BeforeAll
    public static void init() {
        minMaxDivision = new MinMaxDivision();
    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    void solve(int K, int M, List<Integer> A, int answer) {
        int[] inputArray = A.stream().mapToInt(Integer::intValue).toArray();
        assertEquals(answer, minMaxDivision.solve(K, M, inputArray));
    }

    private static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(3, 5, Arrays.asList(2, 1, 5, 1, 2, 2, 2), 6),
                Arguments.of(3, 4, Arrays.asList(1, 2, 3, 4), 4)
        );
    }
}