package br.com.projetoetec.projetoetec.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="TBL_ETEC")
public class Cadastro {
	
	@Id
	@GeneratedValue
	@Column(name="ID_ETEC")
	private Long id;
	
	
	
	@Column(name="ID_CODIGO")
	private int codigo;
	
	
	@Column(name="TX_NOME_ETEC")
	private String nome;
	
	@Column(name="NR_CEP")
	private Long cep;
	
	@Column(name="TX_ENDERECO")
	private String endereco;
	
	@Column(name="TX_BAIRRO")
	private String bairro;
	
	@Column(name="TX_CIDADE")
	private String cidade;
	
	@Transient
	@Column(name="NR_ALTITUDE")
	private Double altitude;
	
	@Transient
	@Column(name="NR_LONGITUDE")
	private Double longitude;
	
	
	@Column(name="DT_CRIACAO")
	private Date data;

	@PrePersist
	private void preencherDataCriacao() {
		if(data == null) {
			data = new Date();
		}
	}
	
	
}

