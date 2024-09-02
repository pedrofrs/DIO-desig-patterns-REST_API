package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Pagamento;

import java.util.Optional;

public interface PagamentoService {
    Iterable<Pagamento> listarPagamentos();
    Optional<Pagamento> obterPagamento(Long id);
    Pagamento criarPagamento(Pagamento pagamento);
    Optional<Pagamento> atualizarPagamento(Long id, Pagamento pagamento);
    boolean deletarPagamento(Long id);
}
