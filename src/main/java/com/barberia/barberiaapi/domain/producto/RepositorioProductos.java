package com.barberia.barberiaapi.domain.producto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositorioProductos extends JpaRepository<Producto, String>{
    List<Producto> findAll();
}
