package com.barberia.barberiaapi.domain.producto;

public record DatosProducto(
    String sku,
    String nombre,
    String descripcion_corta,
    String descripcion_larga,
    Categoria categoria,
    Marca marca,
    Long stock,
    double precio,
    boolean destacado
    ){
    
    public DatosProducto(Producto producto){
        this(
            producto.getSku(),
            producto.getNombre(),
            producto.getDescripcion_corta(),
            producto.getDescripcion_larga(),
            producto.getCategoria(),
            producto.getMarca(),
            producto.getStock(),
            producto.getPrecio(),
            producto.isDestacado()
        );
    }
}
