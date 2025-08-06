/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionLocal.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.ejb.Local;

/**
 *
 * @author JoseAlbertoPortugalO
 */
@Local
public interface PostBeanLocal {

    public Boolean isValidEmail(String email);

    public Boolean isValidAge(String age);

    public Boolean isValidPost(String message);

}
