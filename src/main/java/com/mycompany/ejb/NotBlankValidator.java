/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Bean_Validation/Validator.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JoseAlbertoPortugalO
 */
public class NotBlankValidator implements ConstraintValidator<NotBlank, String> {
    
    @Override
    public void initialize(NotBlank constraintAnnotation) {
    }
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            if (!value.equals("")) {
                
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(NotBlankValidator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
