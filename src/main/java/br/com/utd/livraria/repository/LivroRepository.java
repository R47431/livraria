package br.com.utd.livraria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.utd.livraria.entidades.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
