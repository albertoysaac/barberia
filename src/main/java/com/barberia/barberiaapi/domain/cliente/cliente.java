package com.barberia.barberiaapi.domain.cliente;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "clientes")
@Entity(name = "cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "email")
public class cliente {

    @Id
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private String telefono;
    private Genero genero;
    private boolean estado;
    private String calle;
    private String alcaldia;
    private String ciudad;
    private String codigo_postal;
}
