/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.usa.sbweek3.web;

import com.edu.usa.sbweek3.modelo.Categoria;
import com.edu.usa.sbweek3.servicios.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author re
 */
@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    
    @Autowired //con qué se conecta//
    private CategoriaService categoriaService;
    
    @GetMapping("/all")
    private List<Categoria> getAll(){        
        return categoriaService.getAll();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }
    
}
