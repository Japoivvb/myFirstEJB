/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.ejb.Stateless;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JoseAlbertoPortugalO
 */
@Stateless // bean without state, with pool in EJB container
public class PostBean implements PostBeanLocal {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Boolean isValidEmail(String email) {
    //pattern
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public Boolean isValidAge(String age) {
    //min 18
        if (age != null && !age.equals("")) {
            return Integer.parseInt(age) >= 18;
        }
        return false;
    }

    @Override
    public Boolean isValidPost(String message) {
    //length post < 150
        return message.length() <= 150;
    }
    
}
