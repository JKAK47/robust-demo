package com.toby.api.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class HelloDTO {

    @NotBlank(message = "name is not blank")
    private String name;

    @Min(value = 0,message = " 最小 为 0")
    @Max(value = 150,message = "最大值为 150 ")
    private int age;

}
