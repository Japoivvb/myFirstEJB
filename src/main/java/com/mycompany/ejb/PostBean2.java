/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatefulEjbClass.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.ejb.Stateful;

/**
 *
 * @author JoseAlbertoPortugalO
 */
@Stateful(name = "PostBean2") // bean with state and session, saving data in properties, no pool in EJB container
public class PostBean2 implements PostBean2Local {

    private int age;
    private String message;
    private String email;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        if (!age.equals("")) {
            this.age = Integer.parseInt(age);
        } else {
            this.age = 0;
        }
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
