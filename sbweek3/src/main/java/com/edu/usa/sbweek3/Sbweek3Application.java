package com.edu.usa.sbweek3;

import com.edu.usa.sbweek3.modelo.Categoria;
import com.edu.usa.sbweek3.modelo.Producto;
import com.edu.usa.sbweek3.repositorios.CategoriaRepository;
import com.edu.usa.sbweek3.repositorios.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.edu.usa.sbweek3.repositorios.crud.ProductoCrudRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.edu.usa.sbweek3"})
public class Sbweek3Application {

    @Autowired
    private ProductoRepository repo;
    
    @Autowired
    private CategoriaRepository repoCategoria;

    public static void main(String[] args) {
        SpringApplication.run(Sbweek3Application.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {
            List<Producto> ps = repo.getAll();
            System.out.println("Productos: " + ps.size());
            
            List<Categoria> cs = repoCategoria.getAll();
            System.out.println("Categorias: " + cs.size());
        };
    }
}
