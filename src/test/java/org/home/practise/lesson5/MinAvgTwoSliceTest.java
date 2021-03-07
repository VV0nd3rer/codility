package org.home.practise.lesson5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {
    private static MinAvgTwoSlice minAvgTwoSlice;

    @BeforeAll
    private static void init() {
        minAvgTwoSlice = new MinAvgTwoSlice();
    }
    @ParameterizedTest
    @MethodSource("provideArray")
    void solution(List<Integer> array, int expectedResult) {
        int[] A = array.stream().mapToInt(Integer::intValue).toArray();
        assertEquals(expectedResult, minAvgTwoSlice.solution(A));
    }
    private static Stream<Arguments> provideArray() {
        return Stream.of(
                Arguments.of(Arrays.asList(4, 2, 2, 5, 1, 5, 8), 1),
                Arguments.of(Arrays.asList(-3, -5, -8, -4, -10), 2)
        );
    }
}