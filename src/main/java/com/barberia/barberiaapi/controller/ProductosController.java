package com.barberia.barberiaapi.controller;
import com.barberia.barberiaapi.configurations.Pages;
import com.barberia.barberiaapi.domain.producto.DatosProducto;
import com.barberia.barberiaapi.domain.producto.Producto;
import com.barberia.barberiaapi.domain.producto.RepositorioProductos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.stream.Stream;
import java.util.List;

@Controller
@RequestMapping("/productos")
public class ProductosController {

    private final RepositorioProductos repositorioProductos;

    public ProductosController(RepositorioProductos repositorioProductos) {
        this.repositorioProductos = repositorioProductos;
    }

    @GetMapping
    public ModelAndView productos() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(Pages.PRODUCTOS);
        return modelAndView;
    }

    @GetMapping("/productos.json")
    public ResponseEntity<List<DatosProducto>> productosJson() {
        List<Producto> productos = repositorioProductos.findAll();
        List<DatosProducto> datosProductos = productos.stream()
        .<DatosProducto>flatMap(producto -> Stream.of(new DatosProducto(producto))).toList();
        return ResponseEntity.ok(datosProductos);
    }
}