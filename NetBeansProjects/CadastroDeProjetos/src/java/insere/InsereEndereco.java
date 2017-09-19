/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insere;

import classes.Endereco;
import classes.Pessoa;
import dao.DaoFactory;

/**
 *
 * @author 02890117103
 */
public class InsereEndereco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DaoFactory factory = new DaoFactory();
        Pessoa pessoa = new Pessoa();
        pessoa.setId(5);
        
        Endereco endereco = new Endereco();
        endereco.setCep(99771996);
        endereco.setCidade("Palmas");
        endereco.setEstado("Tocantins");
        endereco.setLogradouro("Bairro");
        endereco.setNumero(33);
        endereco.setPessoa(pessoa);
        
        factory.getEnderecoDao().add(endereco);
    }
    
}
