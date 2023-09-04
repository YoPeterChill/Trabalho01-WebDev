package com.tattoos.models;

import java.io.Serializable;
import java.util.Date;

import com.tattoos.DTOs.ArtistaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@Entity
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode(callSuper = true)
@Table(name="artista")
public class Artista extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
@Column(name="photoURL")
	private String photoURL ;
public Artista(ArtistaDTO obj){
	
    this.setId(obj.getId());
    this.setNome(obj.getNome());
    this.setCpf(obj.getCpf());
    this.setData(obj.getData());
    this.setEmail(obj.getEmail());
    this.setEscolaridade(obj.getEscolaridade());
    this.setProfissao(obj.getProfissao());
    this.setTelefone(obj.getTelefone());
    
 
 
}
//fazer uma relação n p n



}
