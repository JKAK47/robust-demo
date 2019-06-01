package com.toby.consumer.service;

import com.toby.api.HelloService;
import com.toby.api.dto.HelloDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PengRong
 * @package com.toby.consumer.service
 * @ClassName HelloServiceTest.java
 * @date 2019/6/1 - 11:08
 * @ProjectName robust-demo
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void testsayHello1(){
        HelloDTO helloDTO = new HelloDTO();

        helloService.sayHello(helloDTO);
    }

    @Test
    public void test2(){
        helloService.sayHello("ss",166);
    }
}
