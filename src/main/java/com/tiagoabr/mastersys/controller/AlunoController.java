package com.tiagoabr.mastersys.controller;

import com.tiagoabr.mastersys.dto.AlunoRequest;
import com.tiagoabr.mastersys.dto.AlunoResponse;
import com.tiagoabr.mastersys.service.AlunoService;
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
}