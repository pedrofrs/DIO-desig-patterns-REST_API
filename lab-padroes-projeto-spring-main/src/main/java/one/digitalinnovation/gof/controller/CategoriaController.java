package one.digitalinnovation.gof.controller;


import one.digitalinnovation.gof.model.Categoria;
import one.digitalinnovation.gof.model.repository.CategoriaRepository;
import one.digitalinnovation.gof.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public ResponseEntity<Iterable<Categoria>> tadasCategorias (){
        return ResponseEntity.ok(categoriaService.listarCategorias());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarId (@PathVariable Long id ){
        return categoriaService.obterCategoria(id)
               .map( categoria -> ResponseEntity.ok(categoria))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Categoria> adicionarCategoria(@RequestBody Categoria categoria){
        categoriaService.criarCategoria(categoria);
        return ResponseEntity.ok(categoria);
    }

    @PutMapping({"/id"})
    public ResponseEntity<Categoria> atulizarCategoria (@PathVariable Long id,@RequestBody Categoria categoria){
        return categoriaService.atualizarCategoria(id, categoria).map( categoria1 -> ResponseEntity.ok(categoria1))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCategoria(@PathVariable Long id) {
        if (categoriaService.deletarCategoria(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }



}