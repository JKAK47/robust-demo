package com.toby.provider;


import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "feichao.info")
/** 加载外部配置 注解*/
@Component
@Validated
/** 触发Bean校验 注解*/
@Data
/** 省略 setter 、getter 方法 注解*/
public class ApplicationProperties {

    @NotBlank(message = "名字不能为空，请注意检查，参考值为：肥朝。")
    private String name;

}
