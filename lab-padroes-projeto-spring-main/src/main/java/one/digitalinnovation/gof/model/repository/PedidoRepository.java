package one.digitalinnovation.gof.model.repository;

import one.digitalinnovation.gof.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
