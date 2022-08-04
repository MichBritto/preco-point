package br.com.precopoint.mvc.repository;

import br.com.precopoint.mvc.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
