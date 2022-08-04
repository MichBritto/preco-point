package br.com.precopoint.mvc.repository;

import br.com.precopoint.mvc.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

    List<Categoria> findByNomeCategoria(String categoria);
}