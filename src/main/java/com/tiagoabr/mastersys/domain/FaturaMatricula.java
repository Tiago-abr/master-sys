package com.tiagoabr.mastersys.domain;

import com.tiagoabr.mastersys.domain.enums.StatusFatura;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "faturas_matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaturaMatricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    private BigDecimal valor;

    @Column(name = "data_pagamento")
    private LocalDateTime dataPagamento;

    @Column(name = "data_cancelamento")
    private LocalDate dataCancelamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matricula_id")
    private Matricula matricula;

    @Enumerated(EnumType.STRING)
    private StatusFatura status = StatusFatura.ABERTA;
}
