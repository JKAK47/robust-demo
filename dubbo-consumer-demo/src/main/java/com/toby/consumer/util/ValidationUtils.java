package com.toby.consumer.util;

import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author PengRong
 * @package com.toby.consumer.util
 * @ClassName ValidationUtils.java
 * @date 2019/6/1 - 0:50
 * @ProjectName robust-demo
 * @Description: 要使用这个类需要确保引入了这个依赖
 * <dependency>
        <groupId>org.glassfish</groupId>
        <artifactId>javax.el</artifactId>
        <version>3.0.1-b08</version>
    </dependency>
 */
public class ValidationUtils {


    private static Validator validator = Validation
            .byProvider(HibernateValidator.class)
            .configure()
            .failFast(true)
            .buildValidatorFactory()
            .getValidator();


    public static <T> void validate(T obj) {
        Set<ConstraintViolation<T>> validate = validator.validate(obj);
        StringBuilder builder = new StringBuilder();
        for (ConstraintViolation<T> violation : validate) {
            // 注意，在实际业务中
            // 这里会根据violation进行参数拼接
            // 然后进行自定义异常的抛出
            String message = violation.getMessage();

            builder.append(message);
        }
        throw new RuntimeException(builder.toString());
        //   System.err.println(builder.toString());
    }
}
