package com.example.demo.validation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author XUAN-CW
 * @date 2021/8/3 - 13:06
 */

//IsMobile：自定义的注解
//String：注解参数类型
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    //默认值_false，用于接收注解上自定义的 required
    private boolean required = false;

    //1、初始化方法：通过该方法我们可以拿到我们的注解
    @Override
    public void initialize(IsMobile constraintAnnotation) {
        // 接收我们自定义的属性，是否为空
        required = constraintAnnotation.required();
    }

    //2、逻辑处理
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
            Pattern pattern = Pattern.compile("^[1]\\d{10}$");
            return pattern.matcher(value).matches();
    }

}