package com.itheima.singledesign;

import org.junit.Test;

public class KingTest {
    @Test
    public void getInstance() {
        for (int i = 0; i < 10; i++) {
            King instance = King.getInstance();
            System.out.println(instance);
        }
    }
}
