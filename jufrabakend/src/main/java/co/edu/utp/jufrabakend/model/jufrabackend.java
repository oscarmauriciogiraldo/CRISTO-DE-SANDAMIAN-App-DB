/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.jufrabakend.model;

import co.edu.utp.jufrabakend.enumeration.Status;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Oscar M Giraldo H
 * @versin 1.0
 * @since 16/02/22
 */

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class jufrabackend {
    //@Id
    //@GeneratedValue(strategy = AUTO)
    //private Long id;
    private String tipodoc;
    private Long documento;
    @Column(unique = true)
    @NotEmpty(message = "Nombre cannot be empty or null")
    private String nombre;
    private String telefono;
    private String email;
    private String direcion;
    private String fechana;
    private String etapa;
    //private Status estado;
    private Status status;
    private String photoUrl;
    
    /*
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status ustatus;*/
    
    
}
