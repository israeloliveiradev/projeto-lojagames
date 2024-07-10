package com.generation.LojaGames2000.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.LojaGames2000.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long>{
	
	public List<Categorias> findAllByGeneroContaingIgnoreCase(@Param("genero") String genero);

}
