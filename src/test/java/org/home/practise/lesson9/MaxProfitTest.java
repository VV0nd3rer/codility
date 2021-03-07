package org.home.practise.lesson9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {
    private static MaxProfit maxProfit;

    @BeforeAll
    private static void init() {
        maxProfit = new MaxProfit();
    }

    @ParameterizedTest
    @MethodSource("providePricesLog")
    void solution(List<Integer> pricesLog, int expectedProfit) {
        int[] A = pricesLog.stream().mapToInt(Integer::intValue).toArray();
        assertEquals(expectedProfit, maxProfit.solution(A));
    }

    private static Stream<Arguments> providePricesLog() {
        return Stream.of(
                Arguments.of(Arrays.asList(23171, 21011, 21123, 21366, 21013, 21367), 356)
        );
    }
}