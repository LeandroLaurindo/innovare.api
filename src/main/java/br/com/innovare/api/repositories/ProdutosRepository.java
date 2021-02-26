package br.com.innovare.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.innovare.api.domain.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Integer>{

}
