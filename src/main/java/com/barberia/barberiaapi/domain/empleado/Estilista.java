package com.barberia.barberiaapi.domain.empleado;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "estilistas")
@Entity(name = "Estilista")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "email")
public class Estilista {

    @Id
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private String telefono;
    private Genero genero;
    private String hora_entrada;
    private String hora_salida;
    private String fecha_ingreso;
    private boolean estado;
}
