package com.tiagoabr.mastersys.repository;

import com.tiagoabr.mastersys.domain.Assiduidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssiduidadeRepository extends JpaRepository<Assiduidade, Long> {
}
