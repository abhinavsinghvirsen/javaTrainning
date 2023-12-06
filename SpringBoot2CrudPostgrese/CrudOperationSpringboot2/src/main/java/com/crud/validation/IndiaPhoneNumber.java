package com.crud.validation;



 import java.lang.annotation.Documented;
 import java.lang.annotation.ElementType;
 import java.lang.annotation.Repeatable;
 import java.lang.annotation.Retention;
 import java.lang.annotation.RetentionPolicy;
 import java.lang.annotation.Target;
 import java.util.List;
 import javax.validation.Constraint;
 import javax.validation.Payload;

@Documented
@Constraint(
        validatedBy = {PhoneNumberValidator.class}
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR,
        ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface IndiaPhoneNumber {
    String message() default "please enter valid number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
