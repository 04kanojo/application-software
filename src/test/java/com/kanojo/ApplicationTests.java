package com.kanojo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        String path = "/fuck/323232.jpg";
        int i = path.lastIndexOf('/');
        String substring = path.substring(i + 1);
        System.out.println(substring);
    }

}
