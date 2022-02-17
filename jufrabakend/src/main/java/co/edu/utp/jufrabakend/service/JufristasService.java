/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.jufrabakend.service;

import co.edu.utp.jufrabakend.model.Jufristas;
import java.util.Collection;

/**
 *
 * @author Oscar M Giraldo H
 */
public interface JufristasService {
    
    Jufristas create(Jufristas jufritas);
    // Estado del jufrista 
    Jufristas onoff(String nombre);
    Collection<Jufristas> list(int limit);
    //crud
    Jufristas get(Long documento);
    Jufristas update(Jufristas jufristas);
    Boolean delete(Long documento);
    
}
