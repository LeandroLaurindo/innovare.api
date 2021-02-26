package br.com.innovare.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.innovare.api.domain.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer>{

}
