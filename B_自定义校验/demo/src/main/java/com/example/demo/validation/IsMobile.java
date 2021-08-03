package com.example.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author XUAN-CW
 * @date 2021/8/3 - 13:07
 */

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {IsMobileValidator.class })
public @interface IsMobile {

    //允许为空的属性
    boolean required() default true;

    /**
     * an attribute message that returns the default key for creating error messages in case the
     * constraint is violated
     */
    String message() default "手机号码格式错误";

    /**
     * an attribute groups that allows the specification of validation groups, to which this constraint
     * belongs (see Chapter 5, Grouping constraints). This must default to an empty array of type
     * Class<?>.
     */
    Class<?>[] groups() default { };

    /**
     * an attribute payload that can be used by clients of the Jakarta Bean Validation API to assign
     * custom payload objects to a constraint. This attribute is not used by the API itself
     */
    Class<? extends Payload>[] payload() default { };
}