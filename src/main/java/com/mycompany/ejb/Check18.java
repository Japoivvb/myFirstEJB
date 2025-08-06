/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Bean_Validation/Constraint.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *
 * @author JoseAlbertoPortugalO
 */
@Documented
@Constraint(validatedBy = Check18Validator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Check18 {

    String message() default "{com.mycompany.ejb.Check18}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
