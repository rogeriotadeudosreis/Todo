package com.rogerioreis.todo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rogerioreis.todo.entities.Todo;

public class TodoDto {

	private Integer id;
	private String titulo;
	private String descricao;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataParaFinalizar;

	private Boolean finalizado = false;

	public TodoDto() {
	}

	public TodoDto(Todo todo) {
		this.id = todo.getId();
		this.titulo = todo.getTitulo();
		this.descricao = todo.getDescricao();
		this.dataParaFinalizar = todo.getDataParaFinalizar();
		this.finalizado = todo.getFinalizado();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataParaFinalizar() {
		return dataParaFinalizar;
	}

	public void setDataParaFinalizar(Date dataParaFinalizar) {
		this.dataParaFinalizar = dataParaFinalizar;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

}
