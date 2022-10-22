package br.com.meuvoto.portal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "tb_partido", schema="db_meuvoto")
public class Partido {
	
	@Id 
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	private int nrLegenda;
	private String dsPartido;
	private String dsLegenda;
	private int nrFiliado;
	private Date dtCriacao;
	private Date dtRegistro;
	private String nmPresidente;
			
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNrLegenda() {
		return nrLegenda;
	}
	
	public void setNrLegenda(int nrLegenda) {
		this.nrLegenda = nrLegenda;
	}
	
	public String getDsPartido() {
		return dsPartido;
	}
	
	public void setDsPartido(String dsPartido) {
		this.dsPartido = dsPartido;
	}
	
	public String getDsLegenda() {
		return dsLegenda;
	}
	
	public void setDsLegenda(String dsLegenda) {
		this.dsLegenda = dsLegenda;
	}

	public int getNrFiliado() {
		return nrFiliado;
	}

	public void setNrFiliado(int nrFiliado) {
		this.nrFiliado = nrFiliado;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public Date getDtRegistro() {
		return dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	public String getNmPresidente() {
		return nmPresidente;
	}

	public void setNmPresidente(String nmPresidente) {
		this.nmPresidente = nmPresidente;
	}
	
	

}
