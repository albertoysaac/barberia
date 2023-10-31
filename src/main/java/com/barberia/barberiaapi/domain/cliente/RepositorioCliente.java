package com.barberia.barberiaapi.domain.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<cliente, String> {
}
