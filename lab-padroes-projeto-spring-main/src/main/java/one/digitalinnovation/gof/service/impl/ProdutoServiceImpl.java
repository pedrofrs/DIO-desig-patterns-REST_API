package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Produto;
import one.digitalinnovation.gof.model.repository.ProdutoRepository;
import one.digitalinnovation.gof.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Iterable<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> obterProduto(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto criarProduto(Produto produto) {
        return null;
    }


    @Override
    public Optional<Produto> atualizarProduto(Long id, Produto produto) {
        if (produtoRepository.existsById(id)) {
            produto.setId(id);
            return Optional.of(produtoRepository.save(produto));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletarProduto(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}