package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.ItemPedido;
import one.digitalinnovation.gof.model.repository.ItemPedidoRepository;
import one.digitalinnovation.gof.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemPedidoServiceImpl implements ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @Override
    public Iterable<ItemPedido> listarItensPedido() {
        return itemPedidoRepository.findAll();
    }

    @Override
    public Optional<ItemPedido> obterItemPedido(Long id) {
        return itemPedidoRepository.findById(id);
    }

    @Override
    public ItemPedido criarItemPedido(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    @Override
    public Optional<ItemPedido> atualizarItemPedido(Long id, ItemPedido itemPedido) {
        if (itemPedidoRepository.existsById(id)) {
            itemPedido.setId(id);
            return Optional.of(itemPedidoRepository.save(itemPedido));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletarItemPedido(Long id) {
        if (itemPedidoRepository.existsById(id)) {
            itemPedidoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}