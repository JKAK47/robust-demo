package com.toby.provider.util;

import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * 手动显式调用API 触发校验类
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
        for (ConstraintViolation<T> violation : validate) {
            // 注意，在实际业务中
            // 这里会根据violation进行参数拼接
            // 然后进行自定义异常的抛出
        }
    }

}
