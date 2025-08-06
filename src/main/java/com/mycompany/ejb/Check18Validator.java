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
public class Check18Validator implements ConstraintValidator<Check18, String> {

    @Override
    public void initialize(Check18 constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            if (!value.equals("")) {
                Date naixement = new SimpleDateFormat("yyyy-MM-dd").parse(value);
                int anyAra = Calendar.getInstance().get(Calendar.YEAR);
                Calendar cal = Calendar.getInstance();
                cal.setTime(naixement);
                int anyNaixement = cal.get(Calendar.YEAR);
                return anyAra - anyNaixement >= 18;
            }
        } catch (ParseException ex) {
            Logger.getLogger(Check18Validator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
