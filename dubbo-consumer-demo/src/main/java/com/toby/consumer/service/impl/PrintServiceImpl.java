package com.toby.consumer.service.impl;

import com.toby.api.dto.HelloDTO;
import com.toby.consumer.service.PrintService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author PengRong
 * @package com.toby.consumer.service.impl
 * @ClassName PrintServiceImpl.java
 * @date 2019/6/1 - 0:23
 * @ProjectName robust-demo
 * @Description: @Validated 注解必须放置在 类级别，放置在Method 级别不能达到 触发Bean 校验的效果
 */

@Service
@Slf4j
public class PrintServiceImpl implements PrintService {
    /**
     * 对参数进行校验
     *
     * @param helloDTO
     * @return
     */

    @Override
    public String print(HelloDTO helloDTO) {
        System.out.println(helloDTO);
        log.debug(helloDTO.toString());
        return helloDTO.toString();
    }

    @Override
    public String print(String name, int age) {
        System.out.println(name);
        return name;
    }

    /**
     * 加入校验规则 报错
     * @param age
     * @return
     */
    @Override
    public String print(@Valid @Min(11) @Max(14) int age) {
        System.out.println(age);
        return "";
    }


}
