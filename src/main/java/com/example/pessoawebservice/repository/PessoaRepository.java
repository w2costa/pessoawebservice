/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pessoawebservice.repository;

import com.example.pessoawebservice.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Wilson Wolf Costa <wilson.w.costa@gmail.com>
 */
public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {
    
}
