package com.huy.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
            // chuẩn bị bộ data riêng, sau đó fill vào leenhk test
            // mảng 2 chiều, gồm giá trị kì vọng | con n!

    public static Object[][] initTestData() {
        // trả về mảng 2 chiều
//        object dataset = {5,6,7,8};   // = {các phần tử của mảng cách nhau dấu ,}
//                                //

        Object[][] dataset = {{5, 120},
                            {6, 720},
                            {4,240},
                {3, 6},
                {2, 2},
                {1, 1},
                {0, 1}};

        return dataset;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));

    }
}