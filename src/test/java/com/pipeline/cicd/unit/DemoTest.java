package com.pipeline.cicd.unit;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest {

    @Test
    void checkEven_success(){
        assertTrue(10%2==0);
    }

//    @Test
//    void checkEven_fail(){
//        assertTrue(15%2==0);
//    }
}
