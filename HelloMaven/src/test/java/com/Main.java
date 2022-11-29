package com;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Log
public class Main {
    @Test
    public void Test(){
        log.info("测试");
        Assertions.assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3 });

    }
}
