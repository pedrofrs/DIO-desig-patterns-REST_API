package one.digitalinnovation.gof.controller;


import one.digitalinnovation.gof.model.ItemPedido;
import one.digitalinnovation.gof.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/itens-pedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @GetMapping
    public Iterable<ItemPedido> listarItensPedido() {
        return itemPedidoService.listarItensPedido();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedido> obterItemPedido(@PathVariable Long id) {
        return itemPedidoService.obterItemPedido(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ItemPedido criarItemPedido(@RequestBody ItemPedido itemPedido) {
        return itemPedidoService.criarItemPedido(itemPedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemPedido> atualizarItemPedido(@PathVariable Long id, @RequestBody ItemPedido itemPedido) {
        return itemPedidoService.atualizarItemPedido(id, itemPedido)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarItemPedido(@PathVariable Long id) {
        if (itemPedidoService.deletarItemPedido(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}