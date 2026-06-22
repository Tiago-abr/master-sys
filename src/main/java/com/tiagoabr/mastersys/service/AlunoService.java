package com.tiagoabr.mastersys.service;

import com.tiagoabr.mastersys.domain.Aluno;
import com.tiagoabr.mastersys.dto.AlunoRequest;
import com.tiagoabr.mastersys.dto.AlunoResponse;
import com.tiagoabr.mastersys.repository.AlunoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    public final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public AlunoResponse cadastrar(AlunoRequest request){
        if(request.email() != null && this.alunoRepository.existsByEmail(request.email())){
            throw new RuntimeException("Erro ao cadastrar aluno com este e-mail");
        }

        Aluno aluno = request.toEntity();
        Aluno alunoSalvo = alunoRepository.save(aluno);
        return AlunoResponse.fromEntity(alunoSalvo);
    }

    public Page<AlunoResponse> listar(Pageable pageable){
        return this.alunoRepository.findAll(pageable).map(AlunoResponse::fromEntity);
    }

    public AlunoResponse buscarPorId(Long id){
        return AlunoResponse.fromEntity(this.buscarEntidadePorId(id));
    }

    private Aluno buscarEntidadePorId(Long id){
        return this.alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Erro ao buscar aluno por ID"));
    }
}
