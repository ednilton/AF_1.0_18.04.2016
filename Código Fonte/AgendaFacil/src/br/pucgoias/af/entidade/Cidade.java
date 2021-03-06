package br.pucgoias.af.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe que representa os dados persistentes de uma cidade
 * @author Edileizer
 *
 */
@Entity
@Table(name="cidade")
public class Cidade implements Serializable {
	
	private static final long serialVersionUID = 5152724164913423114L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CID_PK_ID")
	private Integer cidadeId;
	
	@OneToMany(mappedBy="cidade", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Endereco> listaEndereco;
	
	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}

	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="estadoId", referencedColumnName="EST_PK_ID", nullable=false)
	
	public Integer getCidadeId() {
		return cidadeId;
	}
	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cidadeId == null) ? 0 : cidadeId.hashCode());
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
		Cidade other = (Cidade) obj;
		if (cidadeId == null) {
			if (other.cidadeId != null)
				return false;
		} else if (!cidadeId.equals(other.cidadeId))
			return false;
		return true;
	}		
}
