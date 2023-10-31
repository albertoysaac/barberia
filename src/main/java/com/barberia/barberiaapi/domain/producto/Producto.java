package com.barberia.barberiaapi.domain.producto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "productos")
@Entity(name = "Producto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "sku")
public class Producto {
    @Id
    private String sku;
    private String nombre;
    private String descripcion_corta;
    private String descripcion_larga;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @Enumerated(EnumType.STRING)
    private Marca marca;
    private long stock;
    private double precio;
    private boolean destacado;
}
