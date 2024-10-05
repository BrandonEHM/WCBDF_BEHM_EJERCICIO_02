
package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    // Listar todos los productos - GET
    @GetMapping
    public String listarProductos() {
        return "Listar todos los productos - GET";
    }

    // Obtener un producto por id - GET
    @GetMapping("/{id_producto}")
    public String listarProductoPorId(@PathVariable int id_producto) {
        return "Obtener un producto por id - GET: " + id_producto;
    }

    // Agregar un producto - POST
    @PostMapping
    public String agregarProducto(@RequestBody String producto) {
        return "Agregar un producto - POST: " + producto;
    }

    // Actualizar un producto - PUT
    @PutMapping("/{id_producto}")
    public String actualizarProducto(@PathVariable int id_producto, @RequestBody String producto) {
        return "Actualizar un producto por id - PUT: " + producto + " con id: " + id_producto;
    }

    // Eliminar un producto - DELETE
    @DeleteMapping("/{id_producto}")
    public String eliminarProducto(@PathVariable int id_producto) {
        return "Eliminar un producto - DELETE: " + id_producto;
    }
}
