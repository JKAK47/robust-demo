package com.toby.consumer.service;

import com.toby.api.TwoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PengRong
 * @package com.toby.consumer.service
 * @ClassName TwoServiceTest.java
 * @date 2019/6/1 - 11:32
 * @ProjectName robust-demo
 * @Description: TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TwoServiceTest {
    @Autowired
    private TwoService twoService;


    /**
     * 报错：
     * javax.validation.ConstraintDeclarationException: HV000151: A method overriding another method must not alter
     * the parameter constraint configuration, but method public void com.toby.consumer.service.impl.TwoServiceImpl
     * .sayHello(java.lang.String) changes the configuration of public abstract void com.toby.api.TwoService.sayHello
     * (java.lang.String).
     */
    @Test
    public void  test(){
        twoService.sayHello("sdfas");
    }
}
