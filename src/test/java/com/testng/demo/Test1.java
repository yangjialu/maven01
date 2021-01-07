package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void case1() {
        Assert.assertEquals(1, 1);
    }
    @Test
    public void case2() {
        Assert.assertEquals(2, 2);
    }

    @Test
    public void case3() {
        Assert.assertEquals(1, 2);
    }
}
