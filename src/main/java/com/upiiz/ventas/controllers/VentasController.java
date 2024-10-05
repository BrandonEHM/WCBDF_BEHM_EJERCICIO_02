

package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ventas")
public class VentasController {

    // Listar todas las ventas - GET
    @GetMapping
    public String listarVentas() {
        return "Listar todas las ventas - GET";
    }

    // Obtener una venta por id - GET
    @GetMapping("/{id_venta}")
    public String listarVentaPorId(@PathVariable int id_venta) {
        return "Obtener una venta por id - GET: " + id_venta;
    }

    // Agregar una venta - POST
    @PostMapping
    public String agregarVenta(@RequestBody String venta) {
        return "Agregar una venta - POST: " + venta;
    }

    // Actualizar una venta - PUT
    @PutMapping("/{id_venta}")
    public String actualizarVenta(@PathVariable int id_venta, @RequestBody String venta) {
        return "Actualizar una venta por id - PUT: " + venta + " con id: " + id_venta;
    }

    // Eliminar una venta - DELETE
    @DeleteMapping("/{id_venta}")
    public String eliminarVenta(@PathVariable int id_venta) {
        return "Eliminar una venta - DELETE: " + id_venta;
    }
}
