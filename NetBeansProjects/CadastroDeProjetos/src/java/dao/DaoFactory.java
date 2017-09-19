/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Autor;
import classes.Avaliador;
import classes.ComissaoAvaliadora;
import classes.Endereco;
import classes.Premio;
import classes.Projeto;

/**
 *
 * @author marinaldosantos
 */
public class DaoFactory {

    //fabrica de dao's genericos
    public DaoGenerico<Avaliador> getAvaliadorDao() {
        return new DaoGenerico<>(Avaliador.class);
    }

    public DaoGenerico<ComissaoAvaliadora> getComissaoDao() {
        return new DaoGenerico<>(ComissaoAvaliadora.class);
    }

    public DaoGenerico<Projeto> getProjetoDao() {
        return new DaoGenerico<>(Projeto.class);
    }

    public DaoGenerico<Premio> getPremioDao() {
        return new DaoGenerico<>(Premio.class);
    }
    
    public DaoGenerico<Autor> getAutorDao() {
        return new DaoGenerico<>(Autor.class);
    }

    public DaoGenerico<Endereco> getEnderecoDao() {
        return new DaoGenerico<>(Endereco.class);
    }

    //Dao especializados
//    public CursoDao getCursoDao() {
//        return new CursoDao();
//    }
//
//    public AlunoDao getAlunoDao() {
//        return new AlunoDao();
//    }
}
