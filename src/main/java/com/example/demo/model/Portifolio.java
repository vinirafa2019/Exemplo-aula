package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import com.sun.istack.NotNull;

@Entity
public class Portifolio { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	private String descricao;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	
	
	@NotNull
	@NumberFormat(pattern = "#,###.00")
	private BigDecimal valor;
	
	
	@Enumerated(EnumType.STRING)
	private StatusPortifolio status;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public StatusPortifolio getStatus() {
		return status;
	}

	public void setStatus(StatusPortifolio status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Portifolio other = (Portifolio) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
}
