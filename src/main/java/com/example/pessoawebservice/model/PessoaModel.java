/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pessoawebservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_pessoa")
@Entity
public class PessoaModel implements Serializable {
 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_pessoa")
	private Integer codigo;
 
	@Column(name="ds_nome")
	private String  nome;
 
	@Column(name="fl_ativo", columnDefinition="BIT")
	private boolean ativo;
 
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
 
}