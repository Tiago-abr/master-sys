package com.tiagoabr.mastersys.repository;

import com.tiagoabr.mastersys.domain.MatriculaModalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaModalidadeRepository extends JpaRepository<MatriculaModalidade, Long> {
}
