package com.toby.consumer.service.impl;

import com.toby.api.TwoService;
import com.toby.api.dto.HelloDTO;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author PengRong
 * @package com.toby.consumer.service.impl
 * @ClassName TwoServiceImpl.java
 * @date 2019/6/1 - 11:31
 * @ProjectName robust-demo
 * @Description: 报错：验证将所有校验规则写在 接口类实现类中将报错
 * javax.validation.ConstraintDeclarationException: HV000151: A method overriding another method must not alter
 * the parameter constraint configuration, but method public void com.toby.consumer.service.impl.TwoServiceImpl
 * .sayHello(java.lang.String) changes the configuration of public abstract void com.toby.api.TwoService.sayHello
 * (java.lang.String).
 *
 */
@Service
@Validated
public class TwoServiceImpl implements TwoService{
    @Override
    public void sayHello(@Valid HelloDTO helloDTO) {
        System.out.println(helloDTO);
    }

    @Override
    public void sayHello(@Valid @NotEmpty String name) {
        System.out.println(name);
    }
}
