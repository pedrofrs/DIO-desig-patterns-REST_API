package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Produto;

import java.util.Optional;

public interface ProdutoService {
    Iterable<Produto> listarProdutos();
    Optional<Produto> obterProduto(Long id);
    Produto criarProduto(Produto produto);
    Optional<Produto> atualizarProduto(Long id, Produto produto);
    boolean deletarProduto(Long id);
}