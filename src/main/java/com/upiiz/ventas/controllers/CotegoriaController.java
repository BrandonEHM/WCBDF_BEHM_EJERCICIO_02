package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")
public class CotegoriaController {

    //Respuestas para todas las categorias - GET
    @GetMapping
    public String listarCategorias(){
        return "Listar de todas las categoria - GET";
    }

    //Respuestas para una categoria por id - GET
    @GetMapping("/{id}")
    public String listarCategoriaporid(@PathVariable int id){
        return "Obtener una categoria por id - GET"+id;
    }
    //Agregar una categoria - POST
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar una categoria - POST" + categoria;
    }

    //Actualizar una categoria - PUT
    @PutMapping("/{id}")
    public String agregarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Actualizar una categoria por id - POST"+ categoria + "con id: "+ id;
    }

    /*
    * @PutMapping("/{id}")
    public ResponseEntity<Categoria> updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria updatedCategoria = categoriaService.updateCategoria(id, categoria);
        return updatedCategoria != null ? ResponseEntity.ok(updatedCategoria) : ResponseEntity.notFound().build();
    }
    * */
    //Eliminar una categoria - DELETE
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id) {
        return "Eliminar una categoria - DELETE";
    }

}
