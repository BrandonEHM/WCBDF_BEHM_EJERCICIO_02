package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facturas")
public class FacturasController {

    // Listar todas las facturas - GET
    @GetMapping
    public String listarFacturas() {
        return "Listar todas las facturas - GET";
    }

    // Obtener una factura por id - GET
    @GetMapping("/{id_factura}")
    public String listarFacturaPorId(@PathVariable int id_factura) {
        return "Obtener una factura por id - GET: " + id_factura;
    }

    // Agregar una factura - POST
    @PostMapping
    public String agregarFactura(@RequestBody String factura) {
        return "Agregar una factura - POST: " + factura;
    }

    // Actualizar una factura - PUT
    @PutMapping("/{id_factura}")
    public String actualizarFactura(@PathVariable int id_factura, @RequestBody String factura) {
        return "Actualizar una factura por id - PUT: " + factura + " con id: " + id_factura;
    }

    // Eliminar una factura - DELETE
    @DeleteMapping("/{id_factura}")
    public String eliminarFactura(@PathVariable int id_factura) {
        return "Eliminar una factura - DELETE: " + id_factura;
    }
}
