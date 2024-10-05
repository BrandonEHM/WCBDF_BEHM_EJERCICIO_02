

package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/proveedores")
public class ProveedoresController {

    // Listar todos los proveedores - GET
    @GetMapping
    public String listarProveedores() {
        return "Listar todos los proveedores - GET";
    }

    // Obtener un proveedor por id - GET
    @GetMapping("/{id_proveedor}")
    public String listarProveedorPorId(@PathVariable int id_proveedor) {
        return "Obtener un proveedor por id - GET: " + id_proveedor;
    }

    // Agregar un proveedor - POST
    @PostMapping
    public String agregarProveedor(@RequestBody String proveedor) {
        return "Agregar un proveedor - POST: " + proveedor;
    }

    // Actualizar un proveedor - PUT
    @PutMapping("/{id_proveedor}")
    public String actualizarProveedor(@PathVariable int id_proveedor, @RequestBody String proveedor) {
        return "Actualizar un proveedor por id - PUT: " + proveedor + " con id: " + id_proveedor;
    }

    // Eliminar un proveedor - DELETE
    @DeleteMapping("/{id_proveedor}")
    public String eliminarProveedor(@PathVariable int id_proveedor) {
        return "Eliminar un proveedor - DELETE: " + id_proveedor;
    }
}
