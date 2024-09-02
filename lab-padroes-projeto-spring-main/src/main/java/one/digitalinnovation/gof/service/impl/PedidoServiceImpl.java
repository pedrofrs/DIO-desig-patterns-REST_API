package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Pedido;
import one.digitalinnovation.gof.model.repository.PedidoRepository;
import one.digitalinnovation.gof.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Iterable<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> obterPedido(Long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Optional<Pedido> atualizarPedido(Long id, Pedido pedido) {
        if (pedidoRepository.existsById(id)) {
            pedido.setId(id);
            return Optional.of(pedidoRepository.save(pedido));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletarPedido(Long id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}