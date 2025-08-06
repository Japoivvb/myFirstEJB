/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionLocal.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.ejb.Local;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 *
 * @author JoseAlbertoPortugalO
 * custom constraint validation
 * validate not null @NotNull
 * validate email and phone @Pattern regex @Email
 * validate non-empty -> custom validation @NotBlank
 * validate user is more 18 years old -> custom validation @Check18
 * validate color in hexadecimal and format #hhhhhh -> custom validation @Color from @Pattern
 */ 
@Local
public interface SignupBeanLocal {

    @NotNull(message = "El nom no pot estar buit.")
    @NotBlank(message = "El nom no pot estar buit.")
    public String getNom();

    @NotNull(message = "El cognom no pot estar buit.")
    @NotBlank(message = "El cognom no pot estar buit.")
    public String getCognoms();

    @Check18 (message = "Has de tenir més de 18 anys.")
    @NotBlank(message = "La data de naixement no pot estar buida.")
    public String getNaixement();

    @NotNull(message = "El gènere no pot estar buit.")
    public String getSexe();

    @Email(message = "El correu no és vàlid.")
    @NotBlank(message = "El correu no pot estar buit.")
    public String getEmail();

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{3}", message = "El telèfon no és vàlid.")
    @NotBlank(message = "El telèfon no pot estar buit.")
    public String getTelefon();

    @Color(message = "El color no és vàlid.")
    public String getColor();

    @NotNull(message = "La marca del cotxe no pot estar buida.")
    public String getMarcaCotxe();

    @NotBlank(message = "El vehicle1 no pot estar buit.")
    public String getVehicle1();

    @NotBlank(message = "El vehicle2 no pot estar buit.")
    public String getVehicle2();

    @NotNull(message = "El navegador no pot estar buit.")
    @NotBlank(message = "El navegador no pot estar buit.")
    public String getNavegador();

    public String print();

    public void setNom(String nom);

    public void setCognoms(String cognoms);

    public void setNaixement(String naixement);

    public void setSexe(String sexe);

    public void setEmail(String email);

    public void setTelefon(String telefon);

    public void setColor(String color);

    public void setMarcaCotxe(String marcaCotxe);

    public void setVehicle1(String vehicle1);

    public void setVehicle2(String vehicle2);

    public void setNavegador(String navegador);

}
