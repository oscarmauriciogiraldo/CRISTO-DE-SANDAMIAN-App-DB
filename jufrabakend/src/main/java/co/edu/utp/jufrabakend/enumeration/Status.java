/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.jufrabakend.enumeration;

/**
 *
 * @author Oscar M Giraldo H
 * @versin 1.0
 * @since 16/02/22
 */

// estado del jufrista, si esta activo o inactivo
public enum Status {
    // estado en el que se encuentra el jufrista
    ACTIVO("ACTIVO"),
    INACTIVO("INACTIVO");
    
    private final String status;
    
    Status(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return this.status;
    }
}
