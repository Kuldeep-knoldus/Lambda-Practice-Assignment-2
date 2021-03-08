package com.knoldus;

import org.junit.Assert;
import org.junit.Test;

public class LongEvenNumberTest {
    @Test
    public void getLongEvenNumber() {
        long actualOutput1 = LongEvenNumber.getLongEvenNumber(0);
        Assert.assertEquals(2, actualOutput1);

        long actualOutput2 = LongEvenNumber.getLongEvenNumber(-2);
        Assert.assertEquals(0, actualOutput2);

        long actualOutput3 = LongEvenNumber.getLongEvenNumber(999999999999L);
        Assert.assertEquals(1000000000000L, actualOutput3);

        long actualOutput4 = LongEvenNumber.getLongEvenNumber(123456789);
        Assert.assertNotEquals(123456789, actualOutput4);

        long actualOutput5 = LongEvenNumber.getLongEvenNumber(54486432001L);
        Assert.assertEquals(54486432002L, actualOutput5);
    }


}