package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Categoria;

import java.util.Optional;

public interface CategoriaService {
    Iterable<Categoria> listarCategorias();
    Optional<Categoria> obterCategoria(Long id);
    Categoria criarCategoria(Categoria categoria);
    Optional<Categoria> atualizarCategoria(Long id, Categoria categoria);
    boolean deletarCategoria(Long id);

}
