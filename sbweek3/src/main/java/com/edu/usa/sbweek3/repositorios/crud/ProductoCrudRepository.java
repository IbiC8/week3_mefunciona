/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.usa.sbweek3.repositorios.crud;

import com.edu.usa.sbweek3.modelo.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author re
 */
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    
    @Query(value="SELECT * FROM productos WHERE categoria_id = ? ORDER BY nombre ASC", nativeQuery=true)
    public List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    
}
