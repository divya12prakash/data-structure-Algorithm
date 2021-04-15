package com.dp.datastructures.cracking;

import com.dp.crackingthecoding.arrays.StringCompression;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    StringCompression stringCompression = new StringCompression();

    String input = "aaaaddddeerrrff";


    @Test
    public void test() {
        System.out.println(stringCompression.countString(input));
    }
}
