package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Categoria;
import one.digitalinnovation.gof.model.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServiceImpl implements one.digitalinnovation.gof.service.CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;


    public Iterable<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> obterCategoria(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria criarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> atualizarCategoria(Long id, Categoria categoria) {
        if (categoriaRepository.existsById(id)) {
            categoria.setId(id);
            return Optional.of(categoriaRepository.save(categoria));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletarCategoria(Long id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
