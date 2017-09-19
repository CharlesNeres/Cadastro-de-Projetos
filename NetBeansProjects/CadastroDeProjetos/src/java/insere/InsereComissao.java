/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insere;

import classes.Avaliacao;
import classes.Avaliador;
import classes.ComissaoAvaliadora;
import dao.DaoFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 02890117103
 */
public class InsereComissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DaoFactory factory = new DaoFactory();
        
        Avaliador avaliador1 = new Avaliador();
        avaliador1.setId(4);
        
        Avaliador avaliador2 = new Avaliador();
        avaliador1.setId(6);
        
        List<Avaliador> avaliadores = new ArrayList<>();
        avaliadores.add(avaliador1);
        avaliadores.add(avaliador2);
        
        
        ComissaoAvaliadora comissao = new ComissaoAvaliadora();
        comissao.setAvaliadores(avaliadores);
        
        factory.getComissaoDao().add(comissao);
    }
    
}
