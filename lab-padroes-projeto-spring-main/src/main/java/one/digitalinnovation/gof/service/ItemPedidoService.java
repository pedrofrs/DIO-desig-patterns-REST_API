package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.ItemPedido;

import java.util.Optional;

public interface ItemPedidoService {
    Iterable<ItemPedido> listarItensPedido();
    Optional<ItemPedido> obterItemPedido(Long id);
    ItemPedido criarItemPedido(ItemPedido itemPedido);
    Optional<ItemPedido> atualizarItemPedido(Long id, ItemPedido itemPedido);
    boolean deletarItemPedido(Long id);
}