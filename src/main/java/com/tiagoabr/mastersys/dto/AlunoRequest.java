package com.tiagoabr.mastersys.dto;

import com.tiagoabr.mastersys.domain.Aluno;

import java.time.LocalDate;

public record AlunoRequest(
        String nome,
        LocalDate dataNascimento,
        String genero,
        String telefone,
        String celular,
        String email,
        String observacao,
        String endereco,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String estado,
        String cep
) {
    public Aluno toEntity() {
        Aluno aluno = new Aluno();
        this.setEntity(aluno);
        return aluno;
    }

    public void setEntity(Aluno aluno) {
        aluno.setNome(this.nome);
        aluno.setDataNascimento(this.dataNascimento);
        aluno.setGenero(this.genero);
        aluno.setTelefone(this.telefone);
        aluno.setCelular(this.celular);
        aluno.setEmail(this.email);
        aluno.setObservacao(this.observacao);
        aluno.setEndereco(this.endereco);
        aluno.setNumero(this.numero);
        aluno.setComplemento(this.complemento);
        aluno.setBairro(this.bairro);
        aluno.setCidade(this.cidade);
        aluno.setEstado(this.estado);
        aluno.setCep(this.cep);
    }
}
