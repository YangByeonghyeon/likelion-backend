package com.example.validation.constraints.annotations;

import com.example.validation.constraints.EmailWhitelistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // 어노테이션을 어디에 적용할 것인지 (선택)
@Retention(RetentionPolicy.RUNTIME) // 어노테이션이 언제까지 유지될 것 인지
@Constraint(validatedBy = EmailWhitelistValidator.class)
public @interface EmailWhitelist {
    // 어노테이션 Element
    String message() default "email not in whitelist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
