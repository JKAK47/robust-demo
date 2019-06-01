package com.toby.consumer.service.impl;

import com.toby.api.HelloService;
import com.toby.api.dto.HelloDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author PengRong
 * @package com.toby.consumer.service.impl
 * @ClassName HelloServiceImpl.java
 * @date 2019/6/1 - 11:08
 * @ProjectName robust-demo
 * @Description: 因为接口没有依赖 spring-context 类 ，所以 @Validated 注解需要标记在实现类中 ；但是 Valid 注解在接口中
 * 标记
 */
@Service
@Validated
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(HelloDTO helloDTO) {
        log.info(helloDTO.toString());
    }

    @Override
    public void sayHello(String name, int age) {
        System.out.println(name + age);
        log.info(name + age);
    }


}
