package com.generation.LojaGames2000.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.LojaGames2000.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
