package com.huy.mathutil.core.test;

import com.huy.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

//import static chỉ dành cho những hàm static, để giúp ta làm biếng gõ tên calss châm.
//lẽ ra phải là MathUtility.getFactorial(2); thì nay chỉ cần gõ getFactorial(2); là đủ
// giả sử class có nhiều hàm static thì ta đổi qua dấu *

import static com.huy.mathutil.core.MathUtility.getFactorial;
//import static com.huy.mathutil.core.MathUtility.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    public  void testFactorialGivenRightArg3RunsWell(){
        assertEquals(6, getFactorial(3));
    }

    @Test
    public  void testFactorialGivenRightArg4RunsWell(){
        assertEquals(24, getFactorial(4));

    }

    @Test
    public  void testFactorialGivenRightArg5RunsWell(){
        assertEquals(120, getFactorial(5));

    }


    @Test  //@Test là ghi chú, đánh dấu, kí hiệu - amotation báo hiệu răng hàm này là hàm main() có thể run
            // 1 class test có thể có nhiều @test, vậy 1 class test có thể có nhiều hàm main() - để ứng với
        // nhiều test case khác nhau đều đc run!!!


    // test case #1l: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
//    Steps/ procedure
//    1. Given a valid n, e.g. n = 0
//    2. Call/invoke getFactorial(n=0)
//    3. Execute
//    Expected result:     (kết quả trả ra)
//    The method will return 1 as the result of 0!
//      Stactus:
//    Passed hay Failed đoán xem, chạy app đẫ!!

    public  void testFactorialGivenRightArg0RunsWell(){
        int n = 0; // value đầu vào
        long expectedValue = 1; //hope to see 0! = 1, kì vọng thoii

//        Gọi hàm để xem actual
        long actualValue = getFactorial(n);
        assertEquals(expectedValue, actualValue);
        //vietsubs: so sánh xem 0! có trả về con số 1 hay ko
        //                            actual        expected

        assertEquals(1, getFactorial(0));
        //          expected                actual
        // hàm  assertEquals() so sánh giúp mình 2 value này, nó thảy ra 2 màu
        // màu xanh passed nếu 2 đứa bằng nhau
        // màu đỏ failed nếu 2 đứa ko bằng nhau
        //        mắt vẫn phải nhìn màu
    }
}