package com.toby.api;

import com.toby.api.dto.HelloDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public interface HelloService {
    /**
     * @Valid注解 触发 HelloDto 校验规则 ，
     * HelloDTO 具体的校验规则 在具体javabean中定义好了。
     * @param helloDTO
     */
    void sayHello(@Valid HelloDTO helloDTO);

    /**
     * 对于具体简单类型和原始类型校验可以在参数中添加校验规则
     *
     * @param name
     */
    void sayHello(@Valid @NotEmpty(message = "name 不能为空") String name,
                  @Valid @Max(value = 18,message = "最大值 18") @Min(value = 15,message = "最小值 15") int age);

}
