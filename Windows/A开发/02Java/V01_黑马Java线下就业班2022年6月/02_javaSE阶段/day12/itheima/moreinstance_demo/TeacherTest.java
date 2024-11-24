package com.itheima.moreinstance_demo;

import org.junit.Test;
import static org.junit.Assert.*;


public class TeacherTest {
    @Test
    public void getInstance() {
        for (int i = 0; i < 10; i++) {
            Teacher instance = Teacher.getInstance();
            System.out.println(instance);
        }
    }
}
