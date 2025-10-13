package com.huy;

import com.huy.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Test case no bug
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();

        //Test case bug
        testFactorialGivenWrongArgMinus5ThrowsExpection();
    }

    // test case #4: Check/Verify getFactorial() method with valid parameter, e.g. n = -5
//    Steps/ procedure
//    1. Given a invalid n, e.g. n = -5
//    2. Call/invoke getFactorial(n=-5)
//    3. Execute
//    Expected result:     (kết quả trả ra)
//    The method will throw an exception
//      Stactus:
//    Passed hay Failed đoán xem, chạy app đẫ!!
    public static void testFactorialGivenWrongArgMinus5ThrowsExpection()
    {
        MathUtility.getFactorial(-5); //Passed, vì kì vọng ngoại lệ xuất hiện, và ngoại lệ xuất hiện thật
                                        // Thấy ngoại lệ mà pass là tình hướng ta thiết kế hàm sẽ xảy ra ngoại lệ với số âm giai thừa!!

    }


    // test case #1l: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
//    Steps/ procedure
//    1. Given a valid n, e.g. n = 0
//    2. Call/invoke getFactorial(n=0)
//    3. Execute
//    Expected result:     (kết quả trả ra)
//    The method will return 1 as the result of 0!
//      Stactus:
//    Passed hay Failed đoán xem, chạy app đẫ!!

    public static void testFactorialGivenRightArg0RunsWell(){
        int n = 0; // value đầu vào
        long expectedValue = 1; //hope to see 0! = 1, kì vọng thoii

//        Gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);

//        Test nè, so sanh actual vs. expected
//        dùng biến boolean hoặc in ra
        System.out.println("0!: expected: " + expectedValue);
        System.out.println("0!: actual: " + actualValue);
    }

    // test case #2l: Check/Verify getFactorial() method with valid parameter, e.g. n = 5
//    Steps/ procedure
//    1. Given a valid n, e.g. n = 5
//    2. Call/invoke getFactorial(n=5)
//    3. Execute
//    Expected result:     (kết quả trả ra)
//    The method will return 1 as the result of 5!
//      Stactus:
//    Passed hay Failed đoán xem, chạy app đẫ!!

    public static void testFactorialGivenRightArg5RunsWell(){
        int n = 5; // value đầu vào
        long expectedValue = 120; //hope to see 5! = 120, kì vọng thoii

//        Gọi hàm để xem actual
        long actualValue = MathUtility.getFactorial(n);

//        Test nè, so sanh actual vs. expected
//        dùng biến boolean hoặc in ra
        System.out.println("5!: expected: " + expectedValue);
        System.out.println("5!: actual: " + actualValue);
    }

    // test case #2l: Check/Verify getFactorial() method with valid parameter, e.g. n = 6
//    Steps/ procedure
//    1. Given a valid n, e.g. n = 6
//    2. Call/invoke getFactorial(n=6)
//    3. Execute
//    Expected result:     (kết quả trả ra)
//    The method will return 1 as the result of 6!
//      Stactus:
//    Passed hay Failed đoán xem, chạy app đẫ!!
    public static void testFactorialGivenRightArg6RunsWell(){
        System.out.println("6! expected = 720 | actual = " + MathUtility.getFactorial(6));
    }


}