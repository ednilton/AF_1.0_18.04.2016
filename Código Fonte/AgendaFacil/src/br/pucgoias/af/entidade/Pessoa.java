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
 * Classe que representa os dados persistentes de pessoa
 * @author Edileizer
 *
 */
@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 6487849002108370775L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PES_PK_ID")
	private Integer pesId;
	
	@Column(name="PES_TIPO")
	private String pesTipo;
	
	@Column(name="PES_NOME")
	private String pesNome;
	
	@Column(name="PES_SEXO")
	private String pesSexo;
	
	@Column(name="PES_DATA_NASC")
	private String pesDn;
	
	@Column(name="PES_CPF")
	private String pesCpf;
	
	@Column(name="PES_CNPJ")
	private String pesCnpj;
	
	@Column(name="PES_RG")
	private String pesRg;
	
	@Column(name="PES_RAZAO_SOCIAL")
	private String pesRazaoSocial;
	
	@Column(name="PES_FUNCAO")
	private String pesFuncao;

	@OneToMany(mappedBy="pessoa", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Telefone> listaTelefone;
	
	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}

	@OneToMany(mappedBy="pessoa", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Servicos> listaServico;
	
	public List<Servicos> getListaServico() {
		return listaServico;
	}

	public void setListaServico(List<Servicos> listaServico) {
		this.listaServico = listaServico;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="enderecoId", referencedColumnName="END_PK_ID", nullable=false)
	
	public Integer getPesId() {
		return pesId;
	}

	public void setPesId(Integer pesId) {
		this.pesId = pesId;
	}

	public String getPesTipo() {
		return pesTipo;
	}

	public void setPesTipo(String pesTipo) {
		this.pesTipo = pesTipo;
	}

	public String getPesNome() {
		return pesNome;
	}

	public void setPesNome(String pesNome) {
		this.pesNome = pesNome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pesId == null) ? 0 : pesId.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (pesId == null) {
			if (other.pesId != null)
				return false;
		} else if (!pesId.equals(other.pesId))
			return false;
		return true;
	}

	public String getPesSexo() {
		return pesSexo;
	}

	public void setPesSexo(String pesSexo) {
		this.pesSexo = pesSexo;
	}

	public String getPesDn() {
		return pesDn;
	}

	public void setPesDn(String pesDn) {
		this.pesDn = pesDn;
	}

	public String getPesCpf() {
		return pesCpf;
	}

	public void setPesCpf(String pesCpf) {
		this.pesCpf = pesCpf;
	}

	public String getPesCnpj() {
		return pesCnpj;
	}

	public void setPesCnpj(String pesCnpj) {
		this.pesCnpj = pesCnpj;
	}

	public String getPesRg() {
		return pesRg;
	}

	public void setPesRg(String pesRg) {
		this.pesRg = pesRg;
	}

	public String getPesRazaoSocial() {
		return pesRazaoSocial;
	}

	public void setPesRazaoSocial(String pesRazaoSocial) {
		this.pesRazaoSocial = pesRazaoSocial;
	}

	public String getPesFuncao() {
		return pesFuncao;
	}

	public void setPesFuncao(String pesFuncao) {
		this.pesFuncao = pesFuncao;
	}

}
