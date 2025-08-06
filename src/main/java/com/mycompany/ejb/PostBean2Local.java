/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionLocal.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.ejb.Local;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 *
 * @author JoseAlbertoPortugalO
 * built-in constraint validation
 */
@Local
public interface PostBean2Local {

    @Min(value = 18, message = "Has de ser major d'edat per escriure un missatge.")
    public int getAge();

    @NotNull
    @Size(min = 1, max = 150, message = "El missatge no és vàlid. Ha de tenir menys de 150 caràcters.")
    public String getMessage();

    @NotNull
    @Pattern(regexp = "^(.+)@(.+)$", message = "El correu no és vàlid.")
    public String getEmail();

    public void setAge(String age);

    public void setMessage(String message);

    public void setEmail(String email);
}
