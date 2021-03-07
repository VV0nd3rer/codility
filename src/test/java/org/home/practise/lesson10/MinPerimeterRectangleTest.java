package org.home.practise.lesson10;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinPerimeterRectangleTest {
    private static MinPerimeterRectangle minPerimeterRectangle;

    @BeforeAll
    private static void init() {
        minPerimeterRectangle = new MinPerimeterRectangle();
    }

    @ParameterizedTest
    @MethodSource("provideValues")
    void solution(int area, int expectedMinPerimeter) {
        assertEquals(expectedMinPerimeter, minPerimeterRectangle.solution(area));
    }

    private static Stream<Arguments> provideValues() {
        return Stream.of(
                Arguments.of(1, 4),
                Arguments.of(30, 22),
                Arguments.of(36, 24),
                Arguments.of(48, 28),
                Arguments.of(101, 204),
                Arguments.of(1234, 1238),
                Arguments.of(4564320, 8552),
                Arguments.of(15486451, 30972904),
                Arguments.of(982451653, 1964903308),
                Arguments.of(1000000000, 126500),
                Arguments.of(100000000, 40000)
        );
    }
}