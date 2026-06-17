package com.tiagoabr.mastersys.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "planos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modalidade_id")
    private Modalidade modalidade;

    private String nome;

    @Column(name = "valor_mensal")
    private BigDecimal valorMensal;

    private Boolean ativo = true;
}
