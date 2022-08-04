package br.com.precopoint.mvc.repository;

import br.com.precopoint.mvc.model.Categoria;
import br.com.precopoint.mvc.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByCategoria(Categoria categoria);

    List<Produto> findByCategoriaNomeCategoria(String categoria);
}