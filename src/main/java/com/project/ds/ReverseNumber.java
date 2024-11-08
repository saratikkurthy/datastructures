package com.project.ds;

public class ReverseNumber {
    /**
     *
     * @param num
     * @return
     */
    public static int reverse(int num) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int result = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            if (result > max / 10 || (result == max / 10 && lastDigit > 7))
                return 0;
            if (result < min / 10 || (result == min / 10 && lastDigit < -8))
                return 0;
            result = result * 10 + lastDigit;
            num = num / 10;
        }

        return result;
    }
}
