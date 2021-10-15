/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.usa.sbweek3.repositorios.crud;

import com.edu.usa.sbweek3.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author re
 */
public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
    
}
