package br.pucgoias.agenda.persistencia;

import org.springframework.stereotype.Repository;

import br.pucgoias.af.entidade.Pessoa;

/**
 * Classe que define as operacoes da camada de persistencia de Pessoa
 * @author Edileizer
 *
 */
@Repository
public class PessoaDAOImpl extends GenericoDAOImpl<Pessoa, Integer> implements
		PessoaDAO {

}
