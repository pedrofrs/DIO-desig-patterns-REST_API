package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Pagamento;
import one.digitalinnovation.gof.model.repository.PagamentoRepository;
import one.digitalinnovation.gof.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PagamentoServiceImpl implements PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Override
    public Iterable<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }

    @Override
    public Optional<Pagamento> obterPagamento(Long id) {
        return pagamentoRepository.findById(id);
    }

    @Override
    public Pagamento criarPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    @Override
    public Optional<Pagamento> atualizarPagamento(Long id, Pagamento pagamento) {
        if (pagamentoRepository.existsById(id)) {
            pagamento.setId(id);
            return Optional.of(pagamentoRepository.save(pagamento));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletarPagamento(Long id){
    if(pagamentoRepository.existsById(id)){
        pagamentoRepository.deleteById(id);
        return true;
    }
    return false;
    }
}