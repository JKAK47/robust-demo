package com.toby.consumer.service;

import com.toby.api.dto.HelloDTO;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author PengRong
 * @package com.toby.consumer.service
 * @ClassName PrintService.java
 * @date 2019/6/1 - 0:20
 * @ProjectName robust-demo
 * @Description: 组件内部接口案例
 * 接口中对JavaBean 的取值参数使用JSR 303 校验规则 限制，在实现类中 直接实现校验。
 * 不需要在实现类中在引用校验规则注解
 * 第一步在类级别使用 @Validated 注解 开启校验; 该注解可以写在接口，也可以写在 接口实现类上面。如果接口module 依赖没有@Validated注解 那就写在接口实现类上面
 * 第二步在方法级别 使用 @Valid 注解 注解 方法参数，属性，方法返回值标记校验 是否满足约束
 */
@Validated
public interface PrintService {
    /**
     * 接口定义中定义通过注解 校验 HelloDTO定义的约束规则
     * @param helloDTO
     * @return
     */
    String print(@Valid HelloDTO helloDTO);
    /**
     * 接口定义中的基础数据类型也支持 加载校验规则
     * */
    String print(@Valid @NotEmpty String name, @Valid @Max(18) @Min(15) int age);

    /**
     * 接口定义中不写校验规则，校验规则写在实现类中 ，该方法实现如果加入校验规则将报错
     * @param age
     * @return
     */
    String print(  int age);


}
