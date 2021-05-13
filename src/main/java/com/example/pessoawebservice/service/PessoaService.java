/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pessoawebservice.service;

import com.example.pessoawebservice.model.PessoaModel;
import com.example.pessoawebservice.model.ResponseModel;
import com.example.pessoawebservice.repository.PessoaRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Wilson Wolf Costa <wilson.w.costa@gmail.com>
 */
@RestController
@RequestMapping("/service")
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoa")
    public @ResponseBody
    List<PessoaModel> consultar() {
        System.out.println("Acessando consultar()");
        return this.pessoaRepository.findAll();
    }

    @GetMapping("/pessoa/{codigo}")
    public @ResponseBody
    PessoaModel buscar(@PathVariable("codigo") Integer codigo) {
        System.out.println("Acessando buscar()");
        Optional<PessoaModel> pessoaOpt = this.pessoaRepository.findById(codigo);
        return pessoaOpt.get();
    }

    @PutMapping("/pessoa")
    public @ResponseBody
    ResponseModel put(@RequestBody PessoaModel pessoa) {
        try {
            this.pessoaRepository.saveAndFlush(pessoa);
            return new ResponseModel(1, "Registro salvo com sucesso!");
        } catch (Exception e) {
            return new ResponseModel(0, e.getMessage());
        }
    }

    @PostMapping("/pessoa")
    public @ResponseBody
    ResponseModel post(@RequestBody PessoaModel pessoa) {
        try {
            this.pessoaRepository.saveAndFlush(pessoa);
            return new ResponseModel(1, "Registro salvo com sucesso!");
        } catch (Exception e) {
            return new ResponseModel(0, e.getMessage());
        }
    }

    @DeleteMapping("/pessoa/{codigo}")
    public @ResponseBody
    ResponseModel delete(@PathVariable("codigo") Integer codigo) {
        try {
            this.pessoaRepository.deleteById(codigo);
            return new ResponseModel(1, "Registro excluido com sucesso!");
        } catch (Exception e) {
            return new ResponseModel(0, e.getMessage());
        }
    }

}
