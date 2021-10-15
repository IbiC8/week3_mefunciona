/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.usa.sbweek3.servicios;

import com.edu.usa.sbweek3.modelo.Producto;
import com.edu.usa.sbweek3.repositorios.ProductoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author re
 */
@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    
    public List<Producto> getAll(){
        return productoRepository.getAll();
    }
    
    public Producto getById(int id){
        Optional<Producto> producto= productoRepository.getById(id);
        return producto.orElse(new Producto());
    }
    
    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }
}
