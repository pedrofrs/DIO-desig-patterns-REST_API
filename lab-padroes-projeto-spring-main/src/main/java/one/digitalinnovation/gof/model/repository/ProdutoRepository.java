package one.digitalinnovation.gof.model.repository;

import one.digitalinnovation.gof.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
