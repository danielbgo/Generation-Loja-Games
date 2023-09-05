package com.generation.LojaGames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.LojaGames.model.Categoria;
import com.generation.LojaGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByTipoContainingIgnoreCase(String tipo);

	public Object findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);

	public Object findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
}
