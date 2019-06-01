package com.toby.consumer.service;

import com.toby.api.dto.HelloDTO;
import com.toby.consumer.util.ValidationUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PengRong
 * @package com.toby.consumer.service
 * @ClassName PrintServiceTest.java
 * @date 2019/6/1 - 0:26
 * @ProjectName robust-demo
 * @Description: 无 web 能力 java Service 中实现 JSR 303 校验规则
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PrintServiceTest {
    @Autowired
    private PrintService printService;

    /*
    * 验证不生效的原因是：@Validated 注解必须添加到 service 类上去
    * */
    @Test
    public void testprint1() {
        HelloDTO helloDto = new HelloDTO();
        helloDto.setAge(55);
        helloDto.setName("asdf");
        printService.print(helloDto);

    }
    @Test
    public void  testprint2(){
        /*正例子*/
        printService.print("sd",16);
        /*反例子*/
        printService.print("",10);
        printService.print("sa",10);
    }

    @Test
    public void testprint3(){
        printService.print(10);
    }

}
