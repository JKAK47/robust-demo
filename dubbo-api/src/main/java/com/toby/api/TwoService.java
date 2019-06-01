package com.toby.api;

import com.toby.api.dto.HelloDTO;

/**
 * @author PengRong
 * @package com.toby.api
 * @ClassName TwoService.java
 * @date 2019/6/1 - 11:29
 * @ProjectName robust-demo
 * @Description: 接口定义中没有任何的校验规则，所有校验规则在实现类中添加,
 */
public interface TwoService {
    /**
     * 没有检验规则
     * @param helloDTO
     */
    void sayHello(HelloDTO helloDTO);

    /**
     * 没有检验规则
     * @param name
     */
    void sayHello(String name);

}
