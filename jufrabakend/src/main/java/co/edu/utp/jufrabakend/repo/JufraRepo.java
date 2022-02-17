/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.jufrabakend.repo;

import co.edu.utp.jufrabakend.model.Jufristas;
//import co.edu.utp.jufrabakend.model.jufrabackend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Oscar M Giraldo H
 */
public interface JufraRepo extends JpaRepository<Jufristas, Long>{
    
    //Server findByIpAddress(String ipAddress)
    
    //tipo documento y documento
    Jufristas findByTipodoc(String tipodoc);
    // este documento no es autoincrementable como el ID
    Jufristas findByDocumento(String documento);
    
    Jufristas findByNombre(String nombre);
    
}
