package org.generation.blogJuliana.repository;

import java.util.List;

import org.generation.blogJuliana.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Indica que a classe é um repositório
@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long> {
	//metodo FindAllByTituloContaingIgnoreCase
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
