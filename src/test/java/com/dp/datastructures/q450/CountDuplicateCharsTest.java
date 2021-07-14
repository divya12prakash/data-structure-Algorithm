package com.dp.datastructures.q450;

import com.dp.q450.strings.CountDuplicateChars;
import org.junit.jupiter.api.Test;

public class CountDuplicateCharsTest {


    CountDuplicateChars cdc = new CountDuplicateChars();

    String input = "sdfffeddds";

    @Test
    public void test() {
        cdc.countDupChars(input);
    }

}
