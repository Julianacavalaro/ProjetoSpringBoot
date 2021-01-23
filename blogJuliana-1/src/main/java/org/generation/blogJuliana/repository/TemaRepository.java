package org.generation.blogJuliana.repository;

import java.util.List;

import org.generation.blogJuliana.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByDescricaoContainingIgnoreCase( String descricao);

}
