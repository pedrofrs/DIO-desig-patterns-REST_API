package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {
    Iterable<Pedido> listarPedidos();
    Optional<Pedido> obterPedido(Long id);
    Pedido criarPedido(Pedido pedido);
    Optional<Pedido> atualizarPedido(Long id, Pedido pedido);
    boolean deletarPedido(Long id);
}