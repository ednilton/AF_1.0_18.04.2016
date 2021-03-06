	package br.pucgoias.af.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe que representa os dados persistentes de um telefone
 * @author Edileizer
 *
 */
@Entity
@Table(name="telefone")
public class Telefone implements Serializable {
	
	private static final long serialVersionUID = 5152724164913423114L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TEL_PK_ID")
	private Integer telId;

	@Column(name="TEL_TIPO")
	private String telTipo;

	@Column(name="TEL_NUMERO")
	private String telNumero;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pesId", referencedColumnName="pesId", nullable=false)
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Integer getTelId() {
		return telId;
	}
	public void setTelId(Integer telId) {
		this.telId = telId;
	}
	public String getTelTipo() {
		return telTipo;
	}
	public void setTelTipo(String telTipo) {
		this.telTipo = telTipo;
	}
	public String getTelNumero() {
		return telNumero;
	}
	public void setTelNumero(String telNumero) {
		this.telNumero = telNumero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((telId == null) ? 0 : telId.hashCode());
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
		Telefone other = (Telefone) obj;
		if (telId == null) {
			if (other.telId != null)
				return false;
		} else if (!telId.equals(other.telId))
			return false;
		return true;
	}
		
}
