package com.tiagoabr.mastersys.controller;

import com.tiagoabr.mastersys.dto.AlunoRequest;
import com.tiagoabr.mastersys.dto.AlunoResponse;
import com.tiagoabr.mastersys.service.AlunoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoResponse cadastrar(@RequestBody AlunoRequest request){
        return this.alunoService.cadastrar(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<AlunoResponse> listar(Pageable pageable){
        return this.alunoService.listar(pageable);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlunoResponse buscarPorId(@PathVariable Long id){
        return this.alunoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlunoResponse atualizar(@PathVariable Long id, @RequestBody AlunoRequest request){
        return this.alunoService.atualizar(id, request);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        this.alunoService.excluir(id);
    }
}