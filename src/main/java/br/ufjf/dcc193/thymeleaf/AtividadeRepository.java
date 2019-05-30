package br.ufjf.dcc193.thymeleaf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AtividadeRepository
 */
@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
   
}