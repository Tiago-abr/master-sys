package com.tiagoabr.mastersys.repository;

import com.tiagoabr.mastersys.domain.Modalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, Long> {
}
